/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.java.nombre;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio2JavaNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre");
        nombre= leer.nextLine();
        
        
        System.out.println("El nombre ingresado es: " + nombre );
    }
    
}
