/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra11.cantidaddigitosdivision;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra11CantidadDigitosDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n, cifras;
 
        
            System.out.println("Introduce un número entero (hasta 10 cifras): ");
            n = leer.nextInt();
            
       
            cifras= 0;    
            

            while(n!=0){            
                   n = n/10;         
                   cifras++;                
            }
            
            System.out.println("El número tiene " + cifras+ " cifras");
            
       }
    
}
