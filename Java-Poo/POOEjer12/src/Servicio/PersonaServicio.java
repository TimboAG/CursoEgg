/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class PersonaServicio {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int dia;
        int mes;
        int anio;

        System.out.println("Ingrese su dia de nacimiento");
        dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        mes = leer.nextInt();
        System.out.println("Ingrese su anio de nacimiento");
        anio = leer.nextInt();

        Persona miPersona = new Persona();
        System.out.println("Ingrese su nombre");
        miPersona.setNombre(leer.next());

        // Date miDate = new Date(anio + 1900, mes - 1, dia);     
        Date miDate = new Date();

        miDate.setYear(anio);
        miDate.setMonth(mes);
        miDate.setDate(dia);

        miPersona.setEdad(miDate);

        System.out.println("*******************************");

        System.out.print(miDate.getDate() + "/");
        System.out.print(miDate.getMonth() + "/");
        System.out.println(miDate.getYear());

        return miPersona;
    }

    public int calcularEdad(Persona p) {
        Date d = new Date();

        int anioActual = d.getYear() + 1900;
        int mesActual = d.getMonth();

        Date fechaNac = p.getEdad();

        int anioNac = (int) fechaNac.getYear();
        int mesNac = (int) fechaNac.getMonth();

        int edad = anioActual - anioNac;


        if (mesActual < mesNac) {
            edad = edad - 1;
        }
        return edad;
    }

    public boolean menorQue(int edad, Persona p) {

        boolean verdad = true;
        int resultado = calcularEdad(p);

        if (edad > resultado) {
            return verdad;
        } else {
            verdad = false;
            return verdad;
        }

    }

    public void mostrarPersona(int edad, Persona p) {
        boolean resultado = menorQue(edad, p);
        int resultado2 = calcularEdad(p);
        System.out.println("*******************************");

        if (resultado) {
            System.out.println("La edad ingresada con la suya es menor? " + resultado);
        } else {
            System.out.println("La edad ingresada con la suya es menor? " + resultado);
        }
        System.out.println(p.getNombre() + " usted tiene: " + resultado2 + " años");
    }

}
