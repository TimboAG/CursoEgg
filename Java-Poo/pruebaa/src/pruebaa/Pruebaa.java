/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaa;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pruebaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner leer = new Scanner(System.in);
        
       
        int num1;
        int i;
        String asterisco;
        
        System.out.println("Ingrese el primer valor");
        num1 = leer.nextInt();
        
        
        for(i=num1; i=num1; i++){            
        
            System.out.print( i +1  );           

        }
        
         for(i=0; i<num1; i++){        
             
            asterisco= "*";            
            System.out.print( asterisco  );
        }

    }
    
}
