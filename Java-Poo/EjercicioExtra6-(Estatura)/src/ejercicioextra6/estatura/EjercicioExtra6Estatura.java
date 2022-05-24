/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra6.estatura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra6Estatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         int  i,j, cont;
         int n;
         double promedio ,suma2, porcentaje;
         
          System.out.println("Ingrese Cantidad de personas");
          n=leer.nextInt();
         
         double[] estatura= new double[n];         
         
         for(i=0; i< n; i++){
             j=i+1;
             System.out.println("Ingrese la estatura de la " +  j + "° persona:");
             estatura[i]= leer.nextDouble();
         }
         
         suma2=0;
         cont=0;
          for(i=0; i< n; i++){
            if( estatura[i] < 1.60){
              cont=cont+1;
              suma2= (suma2 + estatura[i]);
            }
         }          
         
         promedio= suma2 / n;
         porcentaje= (cont*100)/n;
         System.out.println(cont);
         System.out.println("El porcentaje de las personas que miden menos de 1.60 mts es: "+ porcentaje + "%");
         System.out.println("El promedio de las personas que miden menos de 1.60 mts es: "+ promedio + "%");
    }    
}
