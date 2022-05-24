/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafuncion.devolvervector;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PruebaFuncionDevolverVector {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int vector [] = new int[101];
        vector = devVec(vector);
        //int retorno = devVec(vector);
          for(int i = 100; i > 0; i--){
             System.out.println(vector[i]);
        }
        
        
    }
    public static int [] devVec(int vector[]){
   
        int i;
        
        for(i = 0; i < vector.length; i++){
            vector[i]=i;
        }
        
        for(i = 100; i > 0; i--){
            //System.out.println(vector[i]);
        }
        return vector;
    }

}
