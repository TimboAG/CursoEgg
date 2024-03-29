package com.NuevasChismes.NoticiaC.servicio;

import com.NuevasChismes.NoticiaC.entidad.Imagen;
import com.NuevasChismes.NoticiaC.entidad.ImagenUsuario;
import com.NuevasChismes.NoticiaC.entidad.Usuario;
import com.NuevasChismes.NoticiaC.enumeracion.Rol;
import com.NuevasChismes.NoticiaC.excepcion.MiException;
import com.NuevasChismes.NoticiaC.repositorio.ImagenUsuarioRepositorio;
import com.NuevasChismes.NoticiaC.repositorio.UsuarioRepositorio;
//import static com.sun.jmx.snmp.SnmpStatusException.readOnly;  //error
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @Autowired(required = true)
    private ImagenUsuarioServicio miserv;
    @Autowired
    private ImagenUsuarioRepositorio imagenUsuarioRepositorio;

    @Transactional
    public void registrar(MultipartFile archivo, String nombre, String email, String password, String password2) throws MiException, Exception {
        validar(nombre, email, password, password2);
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        usuario.setRol(Rol.USER);
        ImagenUsuario miImagen = miserv.guardar(archivo);
        usuario.setImagen(miImagen);
        usuarioRepositorio.save(usuario);
    }

    @Transactional
    public void actualizar(MultipartFile archivo, String idUsuario, String nombre,
            String email, String password, String password2) throws MiException {
        validarActualizar(nombre, email, password, password2);
        Optional<Usuario> respuesta = usuarioRepositorio.findById(idUsuario);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            usuario.setNombre(nombre);
            usuario.setEmail(email);
            usuario.setPassword(new BCryptPasswordEncoder().encode(password));
            usuario.setRol(Rol.USER);
            Long idImagen = null;
            if (usuario.getImagen() != null) {
                idImagen = usuario.getImagen().getId();
            }
            ImagenUsuario imagen = miserv.actualizar(archivo, idImagen);
            usuario.setImagen(imagen);
            usuarioRepositorio.save(usuario);
        }
    }

    public Usuario getOne(String id) {
        return usuarioRepositorio.getOne(id);
    }

    @Transactional(readOnly = true)
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList();
        usuarios = usuarioRepositorio.findAll();
        return usuarios;
    }

    private void validar(String nombre, String email, String password, String password2) throws MiException {
        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("El nombre no puede estar estar vacío");
        }
        if (email.isEmpty() || email == null) {
            throw new MiException("El email no puede estar vacio");
        }
        if (password.isEmpty()) {
            throw new MiException("La contraseña no puede estar vacía");
        }
        if (password2.isEmpty()) {
            throw new MiException("Debe repetir la contraseña");
        }
        if (password.length() < 5) {
            throw new MiException("La contraseña debe tener más de 5 dígitos");
        }
        if (!password.equals(password2)) {
            throw new MiException("Las contraseñas ingresadas deben ser iguales");
        }
        Usuario usuario = usuarioRepositorio.buscarPorEmail(email);
        if (usuario != null) {
            throw new MiException("El email ya se encuentra registrado");
        }
    }
    
    private void validarActualizar(String nombre, String email, String password, String password2) throws MiException {
        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("El nombre no puede estar estar vacío");
        }
        if (email.isEmpty() || email == null) {
            throw new MiException("El email no puede estar vacio");
        }
        if (password.isEmpty()) {
            throw new MiException("La contraseña no puede estar vacía");
        }
        if (password2.isEmpty()) {
            throw new MiException("Debe repetir la contraseña");
        }
        if (password.length() < 5) {
            throw new MiException("La contraseña debe tener más de 5 dígitos");
        }
        if (!password.equals(password2)) {
            throw new MiException("Las contraseñas ingresadas deben ser iguales");
        }        
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.buscarPorEmail(email);
        if (usuario != null) {
            List<GrantedAuthority> permisos = new ArrayList();
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
            permisos.add(p);
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);
            session.setAttribute("usuariosession", usuario);
            return new User(usuario.getEmail(), usuario.getPassword(), permisos);
        } else {
            return null;
        }
    }
}
