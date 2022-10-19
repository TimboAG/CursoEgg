package com.noticias.noticia.servicio;

import com.noticias.noticia.excepcion.MiException;
import com.noticias.noticia.entidad.ImagenEntidad;
import com.noticias.noticia.entidad.NoticiaEntidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.transaction.annotation.Transactional;
import com.noticias.noticia.repositorio.NoticiaRepositorio;
import org.springframework.context.annotation.ComponentScan;

@Service
public class NoticiaServicio {

    @Autowired(required=true)
    private NoticiaRepositorio noticiaRepositorio;
    @Autowired(required=true)
    private ImagenServicio miserv;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo, MultipartFile archivo) throws MiException, Exception {  
        validar(titulo, cuerpo, archivo);
        NoticiaEntidad miNoticia = new NoticiaEntidad();
        miNoticia.setCuerpo(cuerpo);
        miNoticia.setTitulo(titulo);
        ImagenEntidad miImagen = miserv.guardar(archivo);
        miNoticia.setFoto(miImagen);
        noticiaRepositorio.save(miNoticia);
    }
    
    @Transactional
    public NoticiaEntidad actualizarNoticia(String titulo, Long id, String cuerpo, MultipartFile archivo) throws Exception {
        Optional<NoticiaEntidad> respuesta = noticiaRepositorio.findById(id);
        try {
            NoticiaEntidad miNoticia = new NoticiaEntidad();

            if (respuesta.isPresent()) {
                miNoticia = respuesta.get();
            }
            miNoticia.setCuerpo(titulo);
            ImagenEntidad miImagen = miserv.guardar(archivo);
            miNoticia.setFoto(miImagen);
            miNoticia.setCuerpo(cuerpo);
            return noticiaRepositorio.save(miNoticia);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    @Transactional
    public List<NoticiaEntidad> listarNoticias() {
        List<NoticiaEntidad> miLista = new ArrayList();
        miLista = noticiaRepositorio.findAll();
        return miLista;
    }

    private void validar(String titulo, String cuerpo, MultipartFile archivo) throws MiException {
        if (titulo == null) {
            throw new MiException("El titulo no puede estar vacio");
        }
        if (cuerpo == null) {
            throw new MiException("El cuerpo no puede estar vacio");
        }
        if (archivo == null) {
            throw new MiException("El archivo no puede estar vacio");
        }
    }
}
