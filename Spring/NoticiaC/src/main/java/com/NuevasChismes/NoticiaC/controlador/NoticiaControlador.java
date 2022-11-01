package com.NuevasChismes.NoticiaC.controlador;

import com.NuevasChismes.NoticiaC.entidad.Imagen;
import com.NuevasChismes.NoticiaC.entidad.Noticia;
import com.NuevasChismes.NoticiaC.excepcion.MiException;
import com.NuevasChismes.NoticiaC.servicio.ImagenServicio;
import com.NuevasChismes.NoticiaC.servicio.NoticiaServicio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/noticia")
public class NoticiaControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;

    @GetMapping("/registrar")
    public String registrar() {
        return "noticia_form";
    }

    @PostMapping("/registro")
    public String regristro(@RequestParam("foto") MultipartFile archivo, @RequestParam("titulo") String titulo, @RequestParam("cuerpo") String cuerpo, ModelMap modelo) throws MiException, Exception {
        try {
            noticiaServicio.crearNoticia(titulo, cuerpo, archivo);
            modelo.put("exito", "La noticia fue registrado correctamente!");
        } catch (MiException ex) {
            System.out.println(ex);
            modelo.put("error", ex.getMessage());
            return "noticia_form";
        }
        return "noticia_form";
    }

    @GetMapping("/listar")
    public String listar(ModelMap modelo) {
        List<Noticia> noticiaLista = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticiaLista", noticiaLista);
        return "listar";
    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable Long id, ModelMap modelo) {
        modelo.put("noticiaLista", noticiaServicio.getOne(id));
        return "noticia_modificar";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(@RequestParam("titulo") String titulo, @PathVariable Long id, @RequestParam("cuerpo") String cuerpo, @RequestParam("foto") MultipartFile archivo, ModelMap modelo) throws MiException, Exception {
        try {
            noticiaServicio.actualizarNoticia(titulo, id, cuerpo, archivo);
            return "redirect:../listar";
        } catch (MiException e) {
            modelo.put("error", e.getMessage());
            return "noticia_modificar";
        }
    }
}
