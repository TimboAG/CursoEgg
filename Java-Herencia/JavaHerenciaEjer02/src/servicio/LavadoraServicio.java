/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LavadoraServicio {

    public Lavadora crearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        double precio = 1000;

        System.out.println("Ingrese el color de la lavadora");
        String color = leer.next();

        System.out.println("Ingrese el consumo Energetico de la lavadora (A-B-C-D-E-F)");
        String consumoEnergetico = leer.next();

        System.out.println("Ingrese el peso de la lavadora");
        double peso = leer.nextDouble();

        System.out.println("Ingrese la carga de la lavadora");
        double carga = leer.nextDouble();

        Lavadora miLavadora = new Lavadora(carga, precio, color, consumoEnergetico, peso);

        return miLavadora;

    }

    public void mostrar(Lavadora e) {
        System.out.println(e);
    }
}
