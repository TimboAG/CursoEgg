/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TelevisorServicio {

    public Televisor crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        double precio = 1000;

        System.out.println("Ingrese el color del televisor");
        String color = leer.next();

        System.out.println("Ingrese el consumo Energetico del televisor  (A-B-C-D-E-F)");
        String consumoEnergetico = leer.next();

        System.out.println("Ingrese el peso del televisor");
        double peso = leer.nextDouble();

        System.out.println("Ingrese las pulgadas del televisor");
        double pulgadas = leer.nextDouble();

        System.out.println("tiene sintonizador?");
        String sintonizador2 = leer.next();
        boolean sintonizador = true;

        if (sintonizador2.equalsIgnoreCase("S") || sintonizador2.equalsIgnoreCase("si")) {
            sintonizador = true;

        } else {
            sintonizador = false;

        }

        Televisor miTelevisor = new Televisor(pulgadas, sintonizador, precio, color, consumoEnergetico, peso);

        return miTelevisor;

    }

    public void mostrar(Televisor e) {
        System.out.println(e);
    }
}
