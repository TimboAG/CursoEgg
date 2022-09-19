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
        //ArrayList<ClaseEntidad> miArray = new ArrayList<ClaseEntidad>();
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
        System.out.println("------ Imprime ArrayList toString --------- ");
        System.out.println(miEntidad.toString());
        System.out.println("\n------ Imprime ArrayList For Each --------- ");
        for (ClaseEntidad i : miEntidad) {
            System.out.println(i);
        }
    }

    public void buscar(ArrayList<ClaseEntidad> miEntidad) {
        System.out.println("----------Ingrese el dato a buscar----------");
        String datoBuscar = leer.next();
        int cont = 0;
        int posicion = 0;
        System.out.println("----------FOR EACH----------");
        for (ClaseEntidad i : miEntidad) {
            if (i.getAtributo1().equalsIgnoreCase(datoBuscar) || i.getAtributo2() == Integer.parseInt(datoBuscar)) {
                System.out.println("Elemento encontrado: " + datoBuscar + " en la posicion: " + posicion);
                cont++;
            }
            posicion++;
        }
        if (cont == 0) {
            System.out.println("No existe el dato");
        }
        System.out.println("----------FOR----------");
        for (int i = 0; i < miEntidad.size(); i++) {
            if (datoBuscar.equals(miEntidad.get(i).getAtributo1()) || datoBuscar.equals(String.valueOf(miEntidad.get(i).getAtributo2()))) {
                System.out.println("Elemento encontrado: " + datoBuscar + " en la posicion: " + i);
            }
        }
    }
}
