package com.NuevasChismes.NoticiaC.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminControlador {
     @Autowired
    
   @GetMapping("/tablero")
   public String panelAdministrativo(){
       return "panel";
   }
}
