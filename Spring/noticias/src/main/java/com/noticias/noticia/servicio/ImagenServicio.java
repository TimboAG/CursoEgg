package com.noticias.noticia.servicio;

import com.noticias.noticia.excepcion.MiException;
import com.noticias.noticia.entidad.ImagenEntidad;
import com.noticias.noticia.repositorio.ImagenRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImagenServicio {

    @Autowired
    private ImagenRepositorio imagenRepositorio;

    @Transactional //impactan
    public ImagenEntidad guardar(MultipartFile archivo) throws MiException, Exception {
        validar(archivo);
        ImagenEntidad imagen = new ImagenEntidad();
        if (archivo != null) {
            try {
                imagen.setMime(archivo.getContentType());
                imagen.setNombre(archivo.getName());
                imagen.setContenido(archivo.getBytes());
                return imagenRepositorio.save(imagen);
            } catch (Exception e) {
                System.err.println(e.getMessage());
                return null;
            }
        }
        return imagen;
    }

    @Transactional
    public ImagenEntidad actualizar(MultipartFile archivo, Long id) throws MiException {
        if (archivo != null) {
            try {
                ImagenEntidad imagen = new ImagenEntidad();
                if (id != null) {
                    Optional<ImagenEntidad> respuesta = imagenRepositorio.findById(id);

                    if (respuesta.isPresent()) {
                        imagen = respuesta.get();
                    }
                }
                imagen.setMime(archivo.getContentType());
                imagen.setNombre(archivo.getName());
                imagen.setContenido(archivo.getBytes());
                return imagenRepositorio.save(imagen);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return null;
    }

    @Transactional(readOnly = true) //Es de tipo lectura
    public List<ImagenEntidad> listarImagen() {
        List<ImagenEntidad> miLista = new ArrayList<>();
        miLista = imagenRepositorio.findAll();
        return miLista;
    }

    private void validar(MultipartFile archivo) throws MiException {
        if (archivo == null) {
            throw new MiException("El archivo no puede estar vacio");
        }
    }
}
