/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.java.grados;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio4JavaGrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        double grados;
        double conversion;
        System.out.println("Ingrese ell grado que desea convertir");
        grados= leer.nextDouble();
        
        
        conversion= 32 + (9 * grados / 5);
        
        System.out.println("Los grados ingresados convertidos en Fahrenheit es: " + conversion);
        
        
    }
    
}
