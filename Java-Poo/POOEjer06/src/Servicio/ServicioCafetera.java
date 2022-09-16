/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera() {
        Cafetera miCafe = new Cafetera();
        System.out.println("Ingrese la cantidad maxima");
        miCafe.setCapacidadMaxima(leer.nextDouble());
        miCafe.setCantidadActual(miCafe.getCapacidadMaxima());
        return miCafe;
    }

    public double servirTaza(Cafetera taza) {

        double miTaza, resta;
        System.out.println("Ingrese la cantidad que puede contener la taza vacia");
        miTaza = (leer.nextDouble());

        if (miTaza > taza.getCantidadActual()) {
            System.out.println("La taza supera la cantidad actual.. Se llenara: " + taza.getCantidadActual() + " de cafe");
            taza.setCapacidadMaxima(0);

        } else {
            System.out.println("La taza se lleno exitosamente");
            resta = taza.getCantidadActual() - miTaza;
            taza.setCantidadActual(resta);
        }

        return miTaza;
    }

    public void vaciarCafetera(Cafetera taza) {
        taza.setCantidadActual(0);
    }

    public double agregarCafe(Cafetera x) {
        double suma, cantidad, resta;

        resta = x.getCapacidadMaxima() - x.getCantidadActual();
        System.out.println("Se necesita " + resta + " para llenar la cafetera");
        System.out.println("Ingrese la cantidad que quiere agregar");
        cantidad = leer.nextDouble();
        suma = cantidad + x.getCantidadActual();

        if (suma > x.getCapacidadMaxima()) {
            System.out.println("La cantidad ingresada supera la cantidad que puede contener la cafetera, se agrego " + resta + " mas");
            suma = x.getCantidadActual() + resta;
            x.setCantidadActual(suma);

        } else {
            x.setCantidadActual(suma);
            System.out.println("Se  lleno la cafetera correctamente, ahora la cantidad actual es:  " + x.getCantidadActual());

        }

        return suma;

    }

    public void cantidadDeCafe(Cafetera x) {
        System.out.println("Cantidad actual de cafe en la cafetera: " + x.getCantidadActual());
        System.out.println("Capacidad de la cafetera: " + x.getCapacidadMaxima());

    }

}
