/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PolideportivoServicio {

    public Polideportivo crearPolideportivo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opc = 1;
        String instalacion="";
        
        System.out.println("Ingrese el nombre del polideportivo");
        String nombre = leer.next();

        while (opc != 0) {
            System.out.println("Ingrese la instalacion del polideportivo (Techado o Abierto)");
            instalacion = leer.next();

            if (instalacion.equalsIgnoreCase("Techado") || instalacion.equalsIgnoreCase("Abierto")) {
                opc = 0;
            } else {
                System.out.println("El tipo de instalacion no es correcta vuelva a intentarlo ");
                opc = 1;
            }
        }

        System.out.println("Ingrese el ancho del polideportivo");
        double ancho = leer.nextDouble();

        System.out.println("Ingrese el alto del polideportivo");
        double alto = leer.nextDouble();

        System.out.println("Ingrese el largo del polideportivo");
        double largo = leer.nextDouble();

        Polideportivo miPolidep = new Polideportivo(nombre, instalacion, ancho, largo, alto);

        return miPolidep;

    }

    public void mostrar(Polideportivo e) {
        System.out.println(e);
    }
}