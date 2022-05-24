/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18.java.matriztraspuesta;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Ejercicio18JavaMatrizTraspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int j;
        int[][] matriz = new int[4][4];
        
         Random r = new Random();
         
      System.out.println("-------- Matriz con numeros aleatorios ----------");
     for(i=0; i <  3 ; i++){
         for(j=0; j <  3 ; j++){
        matriz[i][j]=  r.nextInt(6)+1;
    }       
    }
    
     
     System.out.println("-------- Mostrar matriz ----------");
     for(i=0; i <  matriz.length; i++){
         for(j=0; j <  matriz.length ; j++){
     System.out.print(matriz[i][j]);  
    }       
              System.out.println(" ");  

    }
     
        System.out.println("-------- Mostrar matriz traspuesta ----------");
     for(i=0; i <  matriz.length; i++){
         for(j=0; j <  matriz.length ; j++){
     System.out.print(matriz[j][i]);  
    }       
                       System.out.println(" ");  

    }  
        
        
    }
    
}
