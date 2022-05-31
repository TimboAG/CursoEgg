/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author Sony-Pc
 */
public class MatematicaServicio {

    public double devolverMayor(Matematica num1, Matematica num2) {

        double esMayor = 0;

        if (num1.getNum1() > num2.getNum2()) {
            esMayor = num1.getNum1();
        } else {
            esMayor = num2.getNum2();
        }
        System.out.println("El numero mayor es: " + esMayor);

        return esMayor;
    }

    public double calcularPotencia(Matematica num1, Matematica num2) {
        double esMayor = 0;
        double esMenor;
        double potencia;

        if (num1.getNum1() > num2.getNum2()) {
            esMayor = Math.round(num1.getNum1());
            esMenor = Math.round(num2.getNum2());
        } else {
            esMayor = Math.round(num2.getNum2());
            esMenor = Math.round(num1.getNum1());
        }

        potencia = Math.pow(esMayor, esMenor);

        System.out.println("La potencia del numero " + esMayor + " elevado a " + esMenor + " es: " + potencia);

        return potencia;
    }

    public double calculaRaiz(Matematica num1, Matematica num2) {
        double esMenor;
        double raiz;

        if (num1.getNum1() > num2.getNum2()) {
            esMenor = Math.abs(num2.getNum2());
        } else {
            esMenor = Math.abs(num1.getNum1());
        }

        raiz = Math.sqrt(esMenor);

        System.out.println("La raiz cuadrada del menor numero ingresado (" + esMenor + ") es: " + raiz);

        return raiz;
    }

}
