/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11.java.menu;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio11JavaMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
          
          
           
               int suma;
               int resta;
               int multiplicacion;
               int division;
               int opcion;
               int num2;
               int num1;
               String opcion2;
               
               
               System.out.println("Ingrese un numero");
               num1=leer.nextInt();
               System.out.println("Ingrese otro numero");
               num2=leer.nextInt();
               
               
               opcion2= "N";
               do{
                     System.out.println("---------MENU---------");
                     System.out.println("1-SUMAR");
                     System.out.println("2-RESTAR");
                     System.out.println("3-MULTIPLICAR");
                     System.out.println("4-DIVIDIR");
                     System.out.println("5-SALIR");
                     System.out.println("Elija opcion");
                     opcion= leer.nextInt();
                    
                       
                                
                      switch(opcion) {
                             case 1:
                             suma= num1+num2;
                             System.out.println("La suma de los dos numeros ingresados es= " + suma);
                             break;
                             case 2:
                             resta= num1-num2;
                             System.out.println("La resta de los dos numeros ingresados es= " + resta);
                             break;
                             case 3:
                             multiplicacion=num1*num2;
                             System.out.println("La multiplicacion de los dos numeros ingresados es= " + multiplicacion);
                             break;
                             case 4:
                             division= num1/num2;
                             System.out.println("La division de los dos numeros ingresados es= " + division);
                             break;
                             case 5:
                             System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                             opcion2=leer.next();                            
                             break;
                             default:
                            System.out.println("Valor ingresado no valido");
                       }                          
               } while (opcion2.equals("N") == true);    
    }
    
}
