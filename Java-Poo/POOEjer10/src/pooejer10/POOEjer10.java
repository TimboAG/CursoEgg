/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer10;

import Entidad.Arreglo;
import Servicio.ArregloServicio;

/**
 *
 * @author Sony-Pc
 */
public class POOEjer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArregloServicio miServicio = new ArregloServicio();             
        Arreglo miArreglo2 = miServicio.crearArregloA();
       
        miServicio.ordenar(miArreglo2);
            
        miServicio.crearArregloB(miArreglo2);

    }

}
