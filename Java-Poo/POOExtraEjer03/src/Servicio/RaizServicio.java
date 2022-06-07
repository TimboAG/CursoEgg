/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raiz;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RaizServicio {

    public Raiz crear() {
        Raiz miRaiz = new Raiz();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor de a");
        miRaiz.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de b");
        miRaiz.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de c");
        miRaiz.setC(leer.nextDouble());

        return miRaiz;
    }

    public double getDiscriminante(Raiz p) {
        double disc = 0;

        disc = Math.pow(p.getB(), 2) - (4 * p.getA() * p.getC());

        return disc;
    }

    public boolean tieneRaices(Raiz p) {
        boolean tiene = true;

        double disc = getDiscriminante(p);

        if (disc >= 0) {
            tiene = true;
        } else {
            tiene = false;
        }

        return tiene;
    }

    public boolean tieneRaiz(Raiz p) {
        boolean tiene = true;

        double disc = getDiscriminante(p);

        if (disc == 0) {
            tiene = true;
        } else {
            tiene = false;
        }

        return tiene;
    }

    private void obtenerRaices(Raiz p) {
        double disc = getDiscriminante(p);
        boolean tiene = tieneRaices(p);

        double x1 = (-p.getB() + Math.sqrt(disc)) / (2 * p.getA());
        double x2 = (+p.getB() - Math.sqrt(disc)) / (2 * p.getA());

        if (tiene == true) {
            System.out.println("Raiz X1");
            System.out.println(x1);
            System.out.println("Raiz X2");
            System.out.println(x2);
        }

    }

    public void obtenerRaiz(Raiz p) {
        boolean tiene = tieneRaiz(p);
        double x = (-p.getB()) / (2 * p.getA());
        if (tiene == true) {
            System.out.println("Tiene una unica raiz");
            System.out.println(x);
        }

    }

    public void calcular(Raiz p) {
        boolean tiene = tieneRaiz(p);
        boolean tiene2 = tieneRaices(p);

        if (tiene == true) {
            System.out.println(tiene);
            obtenerRaiz(p);

        } else if (tiene2 == true) {
            System.out.println(tiene2);
            obtenerRaices(p);
        } else {
            System.out.println("No se calcularon raices");

        }
    }

}
