/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextraejer02;
import Entidad.Punto;
import Servicio.PuntoServicio;
/**
 *
 * @author Sony-Pc
 */
public class POOExtraEjer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PuntoServicio miServicio = new PuntoServicio();
        Punto miPunto = miServicio.crearPuntos();
        
        miServicio.calcularDistancia(miPunto);
        miServicio.mostrar(miPunto);

    }
    
}
