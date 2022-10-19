package com.noticias.noticia.repositorio;

import com.noticias.noticia.entidad.NoticiaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface NoticiaRepositorio extends JpaRepository<NoticiaEntidad, Long> {

    @Query("SELECT n FROM NoticiaEntidad n WHERE n.titulo = :titulo")
    NoticiaEntidad buscarTitulo(@Param("titulo") String titulo);
}
