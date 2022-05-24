/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02;
import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;
/**
 *
 * @author Sony-Pc
 */
public class POOEj02 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CircunferenciaServicio circServicio = new CircunferenciaServicio();
   Circunferencia circ = circServicio.crearCirscunferencia();
    //Circunferencia circArea = circServicio.area();
    //Circunferencia circPerimetro = circServicio.perimetro();
    
    circServicio.perimetro(circ);
    circServicio.area(circ);
    }
    
}
