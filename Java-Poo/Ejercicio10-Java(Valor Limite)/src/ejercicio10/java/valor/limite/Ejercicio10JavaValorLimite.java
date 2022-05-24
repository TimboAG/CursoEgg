/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10.java.valor.limite;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio10JavaValorLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner leer = new Scanner(System.in);
               
               int limite;
               int suma;
               int num;
               
               System.out.println("Ingreseun valor limite");
               limite=leer.nextInt();
               
               suma=0;
               
               do{
                  System.out.println("Ingreseun un numero para sumar");
                  num=leer.nextInt();
                  suma=suma + num;
               } while (suma<limite);
                   
                  System.out.println("La suma de los numeros ingresados es: " + suma);
               
    }
    
}
