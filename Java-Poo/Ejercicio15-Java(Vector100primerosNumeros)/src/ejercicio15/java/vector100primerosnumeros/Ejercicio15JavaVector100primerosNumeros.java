/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15.java.vector100primerosnumeros;


/**
 *
 * @author Usuario
 */
public class Ejercicio15JavaVector100primerosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int[] vector= new int[101];
    int i;
    
    
    for(i=0; i <  vector.length ; i++){
        vector[i]= i;
    }
    
     for(i=vector.length - 1; i > 0  ; i--){
       System.out.println(vector[i]); 
    }
    
    }
    
}
