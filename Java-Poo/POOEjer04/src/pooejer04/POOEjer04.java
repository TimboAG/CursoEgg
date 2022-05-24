/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer04;
import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;
/**
 *
 * @author Sony-Pc
 */
public class POOEjer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        ServicioRectangulo rectangulo1 = new ServicioRectangulo();
        Rectangulo unRectangulo = rectangulo1.crearRectangulo();
        
        rectangulo1.perimetro(unRectangulo);
        rectangulo1.superficie(unRectangulo);
        rectangulo1.asteriscos(unRectangulo);
        
        
    }
    
}
