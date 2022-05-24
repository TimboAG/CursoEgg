/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.java.equals;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio7JavaEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
String frase;

System.out.println("Ingrese una frase");
frase = leer.nextLine();

if(frase.equals("eureka")== true){
System.out.println("Correcto");
    
}else{
    System.out.println("Incorrecto");

}
    
    }
    
}
