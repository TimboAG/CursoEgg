/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OficinaServicio {
      public EdificioDeOficinas crearOficinas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        

        System.out.println("Ingrese el ancho del edificio");
        double ancho = leer.nextDouble();

        System.out.println("Ingrese el alto del edificio");
        double alto = leer.nextDouble();

        System.out.println("Ingrese el largo del edificio");
        double largo = leer.nextDouble();
        
        System.out.println("Ingrese el numero de pisos del edificio");
        int pisos = leer.nextInt();
        
        System.out.println("Ingrese el numero de oficinas del edificio");
        int oficinas = leer.nextInt();

        System.out.println("Ingrese el numero de personas por oficinas del edificio");
        int personas = leer.nextInt();
        
        EdificioDeOficinas miOficina = new EdificioDeOficinas(oficinas, personas, pisos, ancho, largo, alto);

        return miOficina;

    }

      
      
    public void mostrar(EdificioDeOficinas e) {
        System.out.println(e);
    }
}
