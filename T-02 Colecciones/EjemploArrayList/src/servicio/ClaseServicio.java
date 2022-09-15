/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.ClaseEntidad;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<ClaseEntidad> cargarArray() {
        ArrayList<ClaseEntidad> miArray = new ArrayList();
        String opcionIngreso;
        int opcionFinalizar = 1;
        while (opcionFinalizar != 0) {
            ClaseEntidad miEntidad = crearObjeto();
            miArray.add(miEntidad);
            System.out.println("----------------------------");
            System.out.println("Quiere ingresar otra objeto?");
            opcionIngreso = leer.next();
            if ("S".equalsIgnoreCase(opcionIngreso) || "Si".equalsIgnoreCase(opcionIngreso)) {
                opcionFinalizar = 1;
            } else {
                opcionFinalizar = 0;
            }
        }
        return miArray;
    }

    public ClaseEntidad crearObjeto() {
        ClaseEntidad miEntidad = new ClaseEntidad();
        System.out.println("Ingrese dato atributo1:");
        miEntidad.setAtributo1(leer.next());
        System.out.println("Ingrese dato atributo2:");
        miEntidad.setAtributo2(leer.nextInt());
        System.out.println("Ingrese dato atributoX:");
        miEntidad.setAtributoX(leer.nextDouble());
        return miEntidad;
    }

    public void mostrar(ArrayList<ClaseEntidad> miEntidad) {
        System.out.println(miEntidad.toString());
    }
}
