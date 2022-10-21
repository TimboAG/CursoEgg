package com.NuevasChismes.NoticiaC.controlador;

import com.NuevasChismes.NoticiaC.excepcion.MiException;
import com.NuevasChismes.NoticiaC.servicio.NoticiaServicio;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/noticia")
public class NoticiaControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;

    @GetMapping("/registrar") //localhost:8080/noticia/registrar
    public String registrar() {
        return "noticia_form.html";
    }

    @PostMapping("/registro")
    public String regristro(@RequestParam("foto") MultipartFile archivo, @RequestParam("titulo") String titulo, @RequestParam("cuerpo") String cuerpo) throws MiException, Exception {
        try {
            System.out.println("Titulo = " + titulo);
            System.out.println("Cuerpo = " + cuerpo);
            System.out.println("Foto = " + archivo);
            noticiaServicio.crearNoticia(titulo, cuerpo, archivo);
            // modelo.put("exito", "La noticia fue registrado correctamente!");
        } catch (MiException ex) {
            System.out.println(ex);
            //Logger.getLogger(NoticiaControlador.class.getName()).log(Logger.Level.FATAL, null, ex);
            //Logger.getLogger(noticiaControlador.class.getName()).log(Level.SEVERE, null, ex);
            // modelo.put("error", ex.getMessage());
            return "noticia_form";
        }
        return "noticia_form";
    }
}
