/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Array;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArrayServicio {

    public Array crearArray() {
        Array miArray = new Array();

        String[] miArreglo2 = new String[miArray.getMes().length];

        miArreglo2[0] = "enero";
        miArreglo2[1] = "febrero";
        miArreglo2[2] = "marzo";
        miArreglo2[3] = "abril";
        miArreglo2[4] = "mayo";
        miArreglo2[5] = "junio";
        miArreglo2[6] = "julio";
        miArreglo2[7] = "agosto";
        miArreglo2[8] = "septiembre";
        miArreglo2[9] = "octubre";
        miArreglo2[10] = "noviembre";
        miArreglo2[11] = "diciembre";

        for (int i = 0; i < miArray.getMes().length; i++) {
            miArray.setMes(miArreglo2);
        }
        miArray.setMesSecreto(miArreglo2[6]);
        // miArray.mostrarMesSecreto();
        return miArray;
    }

    public void miMesSecreto(Array p) {

        String opc;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.println("************************************");
            System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
            opc = leer.next();

            if (opc == null ? p.getMesSecreto() != null : !opc.equals(p.getMesSecreto())) {
                System.out.println("No ha acertado. Intente introduciendo otro mes");
            } else {
                System.out.println("¡Ha acertado!");
            }
        } while (opc == null ? p.getMesSecreto() != null : !opc.equals(p.getMesSecreto()));

    }

}
