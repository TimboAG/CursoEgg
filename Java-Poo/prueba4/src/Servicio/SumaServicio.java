/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Suma;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class SumaServicio {
    
    
    public Suma crearSuma(){
        
        Suma miSuma = new Suma();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1");
       // int numero1 = leer.nextInt();
       miSuma.setN1(leer.nextInt());
        System.out.println("Ingrese el numero 2");       
       miSuma.setN2(leer.nextInt());
       
       
        return miSuma;
    }
    
    
   public int Sumar(Suma p){     
       int estaEsLaSuma=0;       
       //estaEsLaSuma= n1 + n2;
       estaEsLaSuma= p.getN1() + p.getN2();
       
       return estaEsLaSuma;       
   }
    
   
   public void mostrar( Suma nombreCualquiera){
     int miMetodo= Sumar(nombreCualquiera);
       System.out.println("Este es el resultado: " + miMetodo);       
   }
    
}
