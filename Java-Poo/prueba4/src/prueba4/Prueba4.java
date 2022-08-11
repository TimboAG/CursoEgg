/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba4;
import Servicio.SumaServicio;
import Entidad.Suma;
import java.util.Scanner;

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
    Scanner leer = new Scanner(System.in);
      //  Suma miSuma = new Suma();
    
      
        System.out.println("Ingrese un numero");
        int numero3 = leer.nextInt();
        
   // miServicio.crearSuma();
       miServicio.mostrar(numero3, miSuma);
    }
    
}
