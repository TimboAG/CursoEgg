/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.java.doble.el.triple.y.la.raíz;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio5JavaDobleElTripleYLaRaíz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
double numero;
double doble;
double triple;
double raiz;
System.out.println("Ingrese un numero");
numero = leer.nextDouble();

doble= 2 * numero;
triple= 3*numero;
raiz= Math.sqrt(numero);

System.out.println("El doble del numero ingresado es: " + doble);
System.out.println("El triple del numero ingresado es: " + triple);
System.out.println("La raiz cuadrada del numero ingresado es: " + raiz);


    }
    
}
