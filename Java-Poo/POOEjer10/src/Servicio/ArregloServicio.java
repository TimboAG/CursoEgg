/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Arreglo;
import java.util.Arrays;

/**
 *
 * @author Sony-Pc
 */
public class ArregloServicio {

    public Arreglo crearArregloA() {
        Arreglo miArreglo = new Arreglo();

        System.out.println("Este es el arrego A");
        double[] miArreglo2 = new double[miArreglo.getA().length];

        for (int i = 0; i < miArreglo.getA().length; i++) {
            miArreglo2[i] = (double) Math.random() * 7;
            miArreglo.setA(miArreglo2);
        }
        miArreglo.mostrarA();

        return miArreglo;
    }

    public Arreglo crearArregloB(Arreglo A) {
        Arreglo miArreglo = new Arreglo();

        double[] miArreglo2 = new double[miArreglo.getA().length];
        double[] miArreglo3 = new double[miArreglo.getB().length];

        miArreglo2 = A.getA();

        for (int i = 0; i < miArreglo.getB().length - 10; i++) {
            miArreglo3[i] = miArreglo2[i];
        }

        for (int i = 10; i < miArreglo.getB().length; i++) {
            miArreglo3[i] = 0.5;
        }

        for (int i = 0; i < miArreglo.getB().length; i++) {
            miArreglo.setB(miArreglo3);
        }

        System.out.println("**************************");
        System.out.println("Este es el arreglo B ");

        miArreglo.mostrarB();

        return miArreglo;
    }

    public void ordenar(Arreglo A) {

        double[] miArreglo2 = new double[A.getA().length];

        System.out.println("**************************");

        System.out.println("Este es el arrego A ordenado de menor a mayor");

        // Arrays.copyOfRange(miArreglo2, 0, 49);
        miArreglo2 = A.getA();
        Arrays.sort(miArreglo2);
        A.setA(miArreglo2);

        System.out.println("**************************");
        A.mostrarA();

    }

}
