/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class PaisServicio {

    public HashSet<Pais> inicio() {

        HashSet<Pais> miHash = new HashSet();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc = 1;
        String opc2;

        while (opc != 0) {

            Pais miPais = crearPais();
            miHash.add(miPais);

            System.out.println("Desea ingresar otro pais?");
            opc2 = leer.next();

            if ("S".equals(opc2) || "s".equals(opc2) || "Si".equals(opc2) || "si".equals(opc2)) {
                opc = 1;
            } else {
                opc = 0;
            }

        }

        return miHash;
    }

    public Pais crearPais() {
        Pais miPais = new Pais();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String pais;

        System.out.println("Ingrese un pais");
        pais = leer.next();

        miPais.setNombre(pais);

        return miPais;
    }

    public void mostrarPais(HashSet<Pais> mi) {
        System.out.println(mi);
    }

    public void ordenadosAlfa(HashSet<Pais> mi) {

        ArrayList<Pais> miArray = new ArrayList(mi);

        Collections.sort(miArray, new Comparator<Pais>() {
            @Override
            public int compare(Pais p1, Pais p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });

        //HashSet <Pais> miPais = new HashSet(mi);
       // TreeSet <Pais> miTree = new TreeSet(mi);
        
        System.out.println(mi);
    }

    public void buscarPais(HashSet<Pais> mi) {

        HashSet<Pais> miPais = new HashSet(mi);
        String pais;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el pais que desea buscar");
        pais = leer.next();

        Iterator<Pais> miIterator = miPais.iterator();

        while (miIterator.hasNext()) {
            if (miIterator.next().equals(pais)) {
                miIterator.remove();
                System.out.println("El pais se ha borrado exitosamente");
            } else {
                System.out.println("No existe el pais");
            }
        }
        System.out.println(miPais);
    }

    public void mostrar(HashSet<Pais> mi) {
        System.out.println("------------------------");
        System.out.println("Los paises son:");
        mostrarPais(mi);
        System.out.println("------------------------");
        System.out.println("Los paises ordenados alfabeticamente son:");
        ordenadosAlfa(mi);
        System.out.println("------------------------");
        buscarPais(mi);

    }

}
