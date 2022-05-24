/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import java.util.Scanner;
import Entidad.Circunferencia;

/**
 *
 * @author Sony-Pc
 */
public class CircunferenciaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    
    public Circunferencia crearCirscunferencia(){
        
        Circunferencia nuevaCirc = new Circunferencia();
        
        System.out.println("Ingrese el radio");
        nuevaCirc.setRadio(leer.nextDouble());
        
        return nuevaCirc;
    }
    
    
    
     public double area(Circunferencia a){
      // Circunferencia nuevaArea = new Circunferencia();
       double area;
       area = Math.PI * Math.pow(a.getRadio(),2);
       System.out.println("El area es: " + area);
     return area;
    }
     
     
     public double perimetro(Circunferencia r){
       // Circunferencia nuevoPer = new Circunferencia();
        double perimetro;
       perimetro = 2 * Math.PI * r.getRadio();
      
       System.out.println("El primetro es: " + perimetro );
return perimetro;
    }
     
     
    
}
