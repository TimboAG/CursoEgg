/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Punto;
import java.util.Scanner;
/**
 *
 * @author Sony-Pc
 */
public class PuntoServicio {
    
    public Punto crearPuntos(){
        Punto miPunto = new Punto();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la primera coordenada ");
        System.out.println("x1: ");
        miPunto.setX1(leer.nextInt());
        System.out.println("y1: ");
        miPunto.setY1(leer.nextInt());
        
        System.out.println("Ingrese la segunda coordenada ");
        System.out.println("x2: ");
        miPunto.setX2(leer.nextInt());
        System.out.println("y2: ");
        miPunto.setY2(leer.nextInt());
        
        return miPunto;
    }
    
    public double calcularDistancia(Punto p){
        double distancia=0;
        
        distancia= Math.sqrt(Math.pow(p.getX1()-p.getX2(), 2)  + Math.pow(p.getY1()-p.getY2(), 2)  ) ;
        
        return distancia;
    }
    
    
    public void mostrar(Punto p){
        double distancia= calcularDistancia( p);
        
        System.out.println("La distancia entre los 2 puntos es: " + distancia);
    }
}
