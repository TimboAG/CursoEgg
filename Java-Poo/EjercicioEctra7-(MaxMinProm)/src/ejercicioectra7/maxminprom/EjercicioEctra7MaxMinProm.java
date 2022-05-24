/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioectra7.maxminprom;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioEctra7MaxMinProm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         
         int  i,j, cont;
         int n;
         double num,promedio ,suma2, porcentaje, max,min;
         
          System.out.println("Ingrese Cantidad de numeros");
          n=leer.nextInt();
         
         i=0;
         j=1;
         max=0;
         min=99999999;
         suma2=0;
         if(n>0){
             while(i<n){
             System.out.println("Ingrese " + j + "° numero");
             num=leer.nextDouble();
             i++;
             j++;
             
             if(num > max){
                 max=num;
             }
             
             
              if(num < min){
                 min=num;
             }
             
              suma2= suma2 + num;
             
             }
        
         }
         
        promedio= suma2/n;
        
        System.out.println("------------- RESULTADOS CON WHILE ------------");   

        System.out.println("El menor de los numeros ingresados es: " +  min);   
        System.out.println("El mayor de los numeros ingresados es: " +  max);
        System.out.println("El promedio de los numeros ingresados es: " +  promedio);

         System.out.println("------------- CON DO WHILE ------------");   
         
         System.out.println("Ingrese Cantidad de numeros");
          n=leer.nextInt();
         i=0;
         j=1;
         max=0;
         min=99999999;
         suma2=0;
         if(n>0){
            do{
             System.out.println("Ingrese " + j + "° numero");
             num=leer.nextDouble();
             i++;
             j++;
             
             if(num > max){
                 max=num;
             }
             
             
              if(num < min){
                 min=num;
             }
             
              suma2= suma2 + num;
             
             } while(i<n);
        
         }
          System.out.println("------------- RESULTADOS CON DO WHILE ------------");   

        System.out.println("El menor de los numeros ingresados es: " +  min);   
        System.out.println("El mayor de los numeros ingresados es: " +  max);
        System.out.println("El promedio de los numeros ingresados es: " +  promedio);
    }
    
}
