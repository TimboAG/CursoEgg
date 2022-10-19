/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noticias.noticia.controlador;

import com.noticias.noticia.excepcion.MiException;
import com.noticias.noticia.servicio.NoticiaServicio;
import java.util.logging.Level;
import org.jboss.logging.Logger;
import static org.jboss.logging.Logger.getLogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/noticia")
public class noticiaControlador {

    private NoticiaServicio serv;

    
    /* @PostMapping("/registro")
// public String regristro(@RequestParam String titulo, @RequestParam String cuerpo, @RequestParam MultipartFile archivo) {
   public String regristro(@RequestParam String titulo, @RequestParam String cuerpo, @RequestParam MultipartFile archivo) {
        System.out.println("Titulo = " + titulo);
        System.out.println("Cuerpo = " + cuerpo);
        System.out.println("Foto = " + archivo);
        return "noticias_form";
    }
     */
    @PostMapping("/registro")
    public String regristro(@RequestParam MultipartFile archivo, @RequestParam String titulo, @RequestParam String cuerpo) throws MiException, Exception {
 //   public String regristro(@RequestParam("foto") MultipartFile archivo, @RequestParam("titulo") String titulo, @RequestParam("cuerpo") String cuerpo, ModelMap modelo) throws MiException, Exception {
//    public String registro(@RequestParam MultipartFile archivo, String titulo, String cuerpo, ModelMap modelo) throws MiException, Exception{
        try {
            System.out.println("Titulo = " + titulo);
            System.out.println("Cuerpo = " + cuerpo);
            System.out.println("Foto = " + archivo);
            serv.crearNoticia(titulo, cuerpo, archivo);
            // modelo.put("exito", "La noticia fue registrado correctamente!");
        } catch (MiException ex) {
            System.out.println(ex);
            Logger.getLogger(noticiaControlador.class.getName()).log(Logger.Level.FATAL, null, ex);
            //Logger.getLogger(noticiaControlador.class.getName()).log(Level.SEVERE, null, ex);
            //modelo.put("error", ex.getMessage());
            return "noticias_form";
        }
        return "noticias_form";
    }

}
