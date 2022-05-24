/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2.valores.distintos;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra2ValoresDistintos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int A, B, C, D;       
       int aux;
       
       A= 2;
       B=4;
       C=7;
       D=10;
       
       
       System.out.println("----------VALORES-------------- " );
       System.out.println("El valor de A es: " + A);
       System.out.println("El valor de B es: " + B);
       System.out.println("El valor de C es: " + C);
       System.out.println("El valor de D es: " + D);
          
       
       
       
       
      System.out.println("----------CAMBIO DE VALORES-------------- " ); 
      
      aux=B;
      B=C; 
      System.out.println("El valor de B ahora es el valor de C: " + B);
      
      B=aux;
      aux=D;
      D=B;
      
      
      System.out.println("El valor de D ahora es el valor de B: " + D);
      
      D=aux;
      aux=C;
      C=A;
      System.out.println("El valor de C ahora es el valor de A: " + C);
    
      aux=A;
      A=D;
      System.out.println("El valor de A ahora es el valor de D: " + A);
      


    }
    
}
