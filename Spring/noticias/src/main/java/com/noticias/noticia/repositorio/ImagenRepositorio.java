
package com.noticias.noticia.repositorio;

import com.noticias.noticia.entidad.ImagenEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ImagenRepositorio extends JpaRepository<ImagenEntidad, Long> {
    
}
