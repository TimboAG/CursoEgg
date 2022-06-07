/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextraejer01;

import Entidad.Cancion;
import Servicio.CancionServicio;

/**
 *
 * @author Sony-Pc
 */
public class POOExtraEjer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CancionServicio miServicio = new CancionServicio();
        Cancion miCancion = miServicio.crearCancion();
        
        miServicio.mostrar(miCancion);
        
        
        
        
        
    }
    
}
