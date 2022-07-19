/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lenovo Gamers
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        Ahorcado miAhorcado = new Ahorcado();
        String miPalabra;

        System.out.println("Ingrese la palabra a encontrar");
        miPalabra = leer.next();

        
        String[] palabra = new String[miPalabra.length() + 1];
                String[] palabra2 = new String[miPalabra.length() + 1];


        for (int i = 0; i < miPalabra.length(); i++) {
            palabra[i] = miPalabra.substring(i, i + 1);
        }
        
         for (int i = 0; i < miPalabra.length(); i++) {
            palabra2[i] = "-";
            miAhorcado.setMostrarPalabra(palabra2);
        }
         
        miAhorcado.setBuscar(palabra);
        
        System.out.println("Ingrese la cantidad de jugadas maximas");
        miAhorcado.setCantJugadasMax(leer.nextInt());

        miAhorcado.setConLetras(0);
        return miAhorcado;
    }
    
    
 
    

    public int longitud(Ahorcado m) {
        int longitud = m.getBuscar().length - 1;
        return longitud;
    }

    public void buscar(Ahorcado m, String letra) {
        String[] palabra = m.getBuscar();
        
         String[] palabra2 = m.getMostrarPalabra();
        int cont = m.getConLetras();
        
        int posicion = 0;

        for (int i = 0; i < palabra.length - 1; i++) {
            posicion = i + 1;
            if (palabra[i].equalsIgnoreCase(letra)) {
                m.setConLetras(m.getConLetras() + 1);
                palabra[i] = "-";
                palabra2[i] = letra;
                System.out.println("La letra ingresada se encuentra en la palabra en la posicion " + posicion);
            }
            
        }

        if (m.getConLetras() == cont) {
            System.out.println("La letra ingresada no se encuentra en la palabra o ya fue encontrada");
        }
        
        m.setMostrarPalabra(palabra2);  
        m.setBuscar(palabra);
        m.setCantJugadasMax(m.getCantJugadasMax() - 1);
    }
    
    
    public void mostrarPalabraEncontrada(Ahorcado a){     
                 
        for (int i = 0; i < a.getMostrarPalabra().length; i++) {
             System.out.println(a.getMostrarPalabra()[i]);
        }                   
      
    }

    
    
    
    
    
    
    
    
    
    public void encontradas(String letra, Ahorcado a) {
        int faltan;
        faltan = (a.getBuscar().length - 1) - a.getConLetras();
        System.out.println("Cantidad de letras encontradas: " + a.getConLetras());
        System.out.println("Cantidad de letras que faltan encontrar: " + faltan);
    }

    public int intentos(Ahorcado a) {
        return a.getCantJugadasMax() - 1;
    }

    public void juego(Ahorcado m, String letra) {
        System.out.println("------------------------------");
        System.out.println("La longitud de la palabra es: " + longitud(m));

        buscar(m, letra);
        encontradas(letra, m);
        System.out.println("Número de oportunidades restantes:" + intentos(m));
    }

}
