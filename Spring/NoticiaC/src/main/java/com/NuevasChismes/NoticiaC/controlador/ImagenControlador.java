/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.NuevasChismes.NoticiaC.controlador;

import com.NuevasChismes.NoticiaC.entidad.Noticia;
import com.NuevasChismes.NoticiaC.servicio.ImagenServicio;
import com.NuevasChismes.NoticiaC.servicio.NoticiaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Usuario
 */
@Controller
@RequestMapping("/imagen")
public class ImagenControlador {
     @Autowired
    private ImagenServicio imagenServ;
     
     @Autowired
    private NoticiaServicio noticiaServicio;
     
//     @GetMapping("/perfil/{id}")
//     public ResponseEntity<byte[]> imagen(@PathVariable Long id){
//         Noticia noticia = noticiaServicio.getOne(id);
//     }
}
