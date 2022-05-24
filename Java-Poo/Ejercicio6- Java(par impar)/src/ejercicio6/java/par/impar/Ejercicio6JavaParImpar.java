/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.java.par.impar;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6JavaParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      int numero;
      System.out.println("Ingrese un numero entero");
      numero = leer.nextInt();
      
      if (numero % 2 == 0) {
        System.out.println("El numero ingresado es par");
    }else{
        System.out.println("El numero ingresado no es par");

            }
      
      
    }
    
}
