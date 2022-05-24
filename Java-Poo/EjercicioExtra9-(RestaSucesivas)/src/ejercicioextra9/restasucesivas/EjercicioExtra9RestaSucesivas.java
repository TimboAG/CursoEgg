/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra9.restasucesivas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra9RestaSucesivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         int dividendo, divisor, cociente;
          System.out.println("Ingrese dividendo");
          dividendo=leer.nextInt();
         
           System.out.println("Ingrese divisor");
          divisor=leer.nextInt();
         
         
          cociente = 0;
        while(  dividendo >= divisor){ //ciclo para la resta sucesiva
            
            dividendo = dividendo - divisor;
            cociente++;       //variable cociente o resultado
        }
        
                    System.out.println("---------RESULTADO---------");
                    System.out.println("Residuo: " + dividendo);                    
                    System.out.println("Cociente: " + cociente);




    }
    
}
