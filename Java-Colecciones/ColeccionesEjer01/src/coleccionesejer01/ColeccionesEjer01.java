/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coleccionesejer01;
import Entidad.Perros;
import Servicio.PerroServicio;
/**
 *
 * @author Usuario
 */
public class ColeccionesEjer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        PerroServicio miServicio = new PerroServicio();
        Perros miPerro = miServicio.crearPerro();
        
        miServicio.mostrar(miPerro);        
        
    }
    
}
