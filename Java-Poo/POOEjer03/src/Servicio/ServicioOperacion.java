/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Sony-Pc
 */
public class ServicioOperacion {
    
        Scanner leer = new Scanner(System.in);

        
        public  Operacion crearOperacion(){
            Operacion nuevaO = new Operacion();
            System.out.println("Ingrese el primer valor:");
            nuevaO.setNumero1(leer.nextDouble());
            System.out.println("Ingrese el segundo valor:");
            nuevaO.setNumero2(leer.nextDouble());
            
            return nuevaO;
        }
    
    
        
        public double sumar(Operacion n1){
            double suma= n1.getNumero1() + n1.getNumero2();
            System.out.println("La SUMA de los dos numero ingresados es: " + suma);
            return suma;
        }
        
        
        public double restar(Operacion n1){
            double resta= n1.getNumero1() - n1.getNumero2();
            System.out.println("La RESTA de los dos numero ingresados es: " + resta);
            return resta;
        }
        
        
         public double multiplicar(Operacion n1){
             double multiplicar=0; 
             
             if(n1.getNumero1() == 0 || n1.getNumero2() == 0  ) {
                 System.out.println("ERROR, se ha ingresado un valor 0.. La MULTIPLICACION da como resultado 0");
             }else{
                  multiplicar= n1.getNumero1() * n1.getNumero2();
            System.out.println("La MULTIPLICACION de los dos numero ingresados es: " + multiplicar);
             }
            return multiplicar;
        }
        
         
         
         public double dividir(Operacion n1){
             double dividir=0; 
             
             if(n1.getNumero1() == 0 || n1.getNumero2() == 0  ) {
                 System.out.println("ERROR, se ha ingresado un valor 0.. La DIVISION da como resultado 0");
             }else{
                  dividir= n1.getNumero1() / n1.getNumero2();
            System.out.println("La DIVISION de los dos numero ingresados es: " + dividir);
             }
            return dividir;
        }
        
        
        
}
