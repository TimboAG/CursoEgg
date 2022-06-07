/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Sony-Pc
 */
public class CancionServicio {

    public Cancion crearCancion() {
        Cancion miCancion = new Cancion();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una cancion");
        miCancion.setTitulo(leer.next());

        System.out.println("Ingrese el autor");
        miCancion.setAutor(leer.next());

        return miCancion;
    }

    public void mostrar(Cancion c) {
        System.out.println("***************** ");
        System.out.println("La cancion ingresada es: " + c.getTitulo() + " de " + c.getAutor());
    }

}
