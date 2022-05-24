/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16.java.buscarenvector;

import java.util.*;

/**
 *
 * @author Usuario
 */
public class Ejercicio16JavaBuscarEnVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int num;
        int num2;
        int i;
        int cont;

    
     System.out.println("Ingrese un tamaño para el vector");
    num= leer.nextInt();
    
    
    
     int[] vector = new int[num];
    
   Random r = new Random();
      System.out.println("-------- Vector con numeros aleatorios ----------");
     for(i=0; i <  vector.length ; i++){
        vector[i]=  r.nextInt(6)+1;
    }
    
     for(i=vector.length - 1; i > 0  ; i--){
       System.out.println(vector[i]); 
    } 
    
    
    System.out.println("Ingrese un numero a buscar");
    num2= leer.nextInt();
    
    
    
   
    cont=0;
    
    
    
    System.out.println("-------- Buscar numero ----------");
    for(i=0; i <  vector.length ; i++){
       if(vector[i] == num2 ){
           cont = cont +1;
           if(cont == 1){
              System.out.println("El numero se encuenta en la posicion " + i );  
           }else{
               
               System.out.println("El numero se repite en la posicion " + i );
           }
           
       }
    }
    
    if(cont==0){
                   System.out.println("El numero a buscar no se encuentra en el vector");

    }
    }
    
}
