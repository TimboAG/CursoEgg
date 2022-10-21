package com.NuevasChismes.NoticiaC.repositorio;

import com.NuevasChismes.NoticiaC.entidad.Noticia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, String> {

    public Optional<Noticia> findById(Long id);

}
