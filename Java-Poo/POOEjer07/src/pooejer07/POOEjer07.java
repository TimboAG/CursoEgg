/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer07;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Sony-Pc
 */
public class POOEjer07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int contMayor = 0;
        int contMenor = 0;
        int contIdeal = 0;
        int contArribaIdeal = 0;
        int contAbajoIdeal = 0;

        System.out.println("--------PERSONA 1 --------");
        PersonaServicio miPer1 = new PersonaServicio();
        Persona per1Datos = miPer1.crearPersona();
        System.out.println("*********************");

        miPer1.informacion(per1Datos);
        miPer1.calcularIMC(per1Datos);
        miPer1.esMayorDeEdad(per1Datos);

        if (miPer1.esMayorDeEdad(per1Datos) == true) {
            contMayor = contMayor + 1;
        } else {
            contMenor = contMenor + 1;
        }

        if (miPer1.calcularIMC(per1Datos) == -1) {
            contAbajoIdeal = contAbajoIdeal + 1;
        } else if (miPer1.calcularIMC(per1Datos) == 1) {
            contArribaIdeal = contArribaIdeal + 1;
        } else if (miPer1.calcularIMC(per1Datos) == 0) {
            contIdeal = contIdeal + 1;
        }

        System.out.println("--------PERSONA 2 --------");
        PersonaServicio miPer2 = new PersonaServicio();
        Persona per2Datos = miPer2.crearPersona();
        System.out.println("*********************");

        miPer2.informacion(per2Datos);
        miPer2.calcularIMC(per2Datos);
        miPer2.esMayorDeEdad(per2Datos);

        if (miPer2.esMayorDeEdad(per2Datos) == true) {
            contMayor = contMayor + 1;
        } else {
            contMenor = contMenor + 1;
        }

        if (miPer2.calcularIMC(per2Datos) == -1) {
            contAbajoIdeal = contAbajoIdeal + 1;
        } else if (miPer2.calcularIMC(per2Datos) == 1) {
            contArribaIdeal = contArribaIdeal + 1;
        } else if (miPer2.calcularIMC(per2Datos) == 0) {
            contIdeal = contIdeal + 1;
        }

        System.out.println("--------PERSONA 3 --------");
        PersonaServicio miPer3 = new PersonaServicio();
        Persona per3Datos = miPer3.crearPersona();
        System.out.println("*********************");

        miPer3.informacion(per3Datos);
        miPer3.calcularIMC(per3Datos);
        miPer3.esMayorDeEdad(per3Datos);

        if (miPer3.esMayorDeEdad(per3Datos) == true) {
            contMayor = contMayor + 1;
        } else {
            contMenor = contMenor + 1;
        }

        if (miPer3.calcularIMC(per3Datos) == -1) {
            contAbajoIdeal = contAbajoIdeal + 1;
        } else if (miPer3.calcularIMC(per3Datos) == 1) {
            contArribaIdeal = contArribaIdeal + 1;
        } else if (miPer3.calcularIMC(per3Datos) == 0) {
            contIdeal = contIdeal + 1;
        }

        System.out.println("--------PERSONA 4 --------");
        PersonaServicio miPer4 = new PersonaServicio();
        Persona per4Datos = miPer4.crearPersona();
        System.out.println("*********************");

        miPer4.informacion(per4Datos);
        miPer4.calcularIMC(per4Datos);
        miPer4.esMayorDeEdad(per4Datos);

        if (miPer4.esMayorDeEdad(per4Datos) == true) {
            contMayor = contMayor + 1;
        } else {
            contMenor = contMenor + 1;
        }

        if (miPer4.calcularIMC(per4Datos) == -1) {
            contAbajoIdeal = contAbajoIdeal + 1;
        } else if (miPer4.calcularIMC(per4Datos) == 1) {
            contArribaIdeal = contArribaIdeal + 1;
        } else if (miPer4.calcularIMC(per4Datos) == 0) {
            contIdeal = contIdeal + 1;
        }

        System.out.println("*********************");

        System.out.println("La cantidad de personas mayores es: " + contMayor);
        System.out.println("La cantidad de personas menores es: " + contMenor);
        System.out.println("La cantidad de personas en su peso idea es: " + contIdeal);
        System.out.println("La cantidad de personas por arriba de su peso ideal es: " + contArribaIdeal);
        System.out.println("La cantidad de personas por abjo de su peso ideal es: " + contAbajoIdeal);
        double porcentaje = contMayor * 100 / 4;
        System.out.println("El porcentaje de personas mayores de edad es: " + porcentaje + "%");
        porcentaje = contMenor * 100 / 4;
        System.out.println("El porcentaje de personas menores de edad es: " + porcentaje + "%");

    }

}
