package com.NuevasChismes.NoticiaC.repositorio;

import com.NuevasChismes.NoticiaC.entidad.Noticia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, Long> {

    public Optional<Noticia> findById(Long id);
    
    @Query("SELECT n FROM Noticia n WHERE n.alta = :true")
    public Optional<Noticia> alta();

}
