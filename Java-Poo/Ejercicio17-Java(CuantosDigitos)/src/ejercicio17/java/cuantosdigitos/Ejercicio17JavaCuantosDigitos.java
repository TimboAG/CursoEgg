/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17.java.cuantosdigitos;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Ejercicio17JavaCuantosDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    Scanner leer = new Scanner(System.in);  
        
    int n;    
    int i;
    int cont=0;
    int cont1=0;
    int cont2=0;
    int cont3=0;
    int cont4=0;
    int cont5=0;
    

    System.out.println("Ingrese el tamaño del vector");
    n=leer.nextInt();
    
    
    int[] vector= new int[n];

      

    Random r= new Random();
 
  System.out.println("-------- Vector con numeros aleatorios ----------");
     for(i=0; i <  vector.length ; i++){
        vector[i]=  r.nextInt(99999)+1;
    }
    
     for(i=vector.length - 1; i > 0  ; i--){
       System.out.println(vector[i]); 
    } 


       System.out.println("-------- Contabilizador ----------");

     for(i=0; i <  vector.length ; i++){
         
         if(vector[i] < 10){
             cont1= cont1 + 1;
         }else if(vector[i] > 10 && vector[i] < 99 ){
             cont2= cont2 + 1;
         }else if(vector[i] > 100 && vector[i] < 999 ){
             cont3= cont3 + 1;
         }else if(vector[i] > 1000 && vector[i] < 9999 ){
              cont4= cont4 + 1;
         }else if(vector[i] > 10000 && vector[i] < 99999 ){
              cont5= cont5 + 1;
         }else{
             cont=cont + 1;
         }
         
       
    } 

     
     System.out.println("En el vector existen " + cont1 + " de un digito"); 
     System.out.println("En el vector existen " + cont2 + " de dos digito"); 
     System.out.println("En el vector existen " + cont3 + " de tres digito"); 
     System.out.println("En el vector existen " + cont4 + " de cuatro digito"); 
     System.out.println("En el vector existen " + cont5 +  " de cinco digito"); 
     System.out.println("En el vector existen " + cont + " de digito mayor a 5"); 
     
    }
    
}
