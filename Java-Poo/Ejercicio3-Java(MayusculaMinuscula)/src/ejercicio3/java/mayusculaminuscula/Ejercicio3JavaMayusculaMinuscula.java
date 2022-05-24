/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.java.mayusculaminuscula;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio3JavaMayusculaMinuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase");
        frase= leer.nextLine();
        
        
        System.out.println("La frase ingresada en mayuscula es: " + frase.toUpperCase());
        System.out.println("La frase ingresada en minuscula es: " + frase.toLowerCase());

        
        
    }
    
}
