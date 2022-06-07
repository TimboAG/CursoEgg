/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba4;
import Entidad.Suma;
import Servicio.SumaServicio;

/**
 *
 * @author Usuario
 */
public class Prueba4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SumaServicio miServicio = new SumaServicio();
       Suma miSuma = miServicio.crearSuma();
    
      //  Suma miSuma = new Suma();
    
   // miServicio.crearSuma();
       
       miServicio.Sumar(miSuma);
       miServicio.mostrar(miSuma);
    }
    
}
