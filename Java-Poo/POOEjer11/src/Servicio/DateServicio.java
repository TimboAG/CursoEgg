/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Date1;
import java.util.Scanner;

/**
 *
 * @author Sony-Pc
 */
public class DateServicio {

    public Date1 crearDate(Date1 m) {

        int anio = m.getAnio();
        int mes = m.getMes() + 1;
        int dia = m.getDia();
        int fecha = m.getFecha();
        String dia2;

        dia2 = " ";

        switch (dia) {
            case 0:
                dia2 = "Lunes";
                break;
            case 1:
                dia2 = "Lunes";

                break;
            case 2:
                dia2 = "Martes";

                break;
            case 3:
                break;
            case 4:
                dia2 = "Miercoles";

                break;
            case 5:
                dia2 = "Jueves";

                break;
            case 6:
                dia2 = "Viernes";

                break;
            case 7:
                dia2 = "Sabado";

                break;
            case 8:
                dia2 = "Domingo";

                break;

        }

        System.out.println("El dia de hoy es : " + dia2 + " " + fecha + " del " + mes + " del año " + anio);
        return m;
    }

    public Date1 crearDatePersona() {

        Date1 m = new Date1();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la fecha de hoy (ej: 31)");
        m.setFechaI(leer.nextInt());

        System.out.println("Ingrese el mes actual (ej: 5)");
        m.setMesI(leer.nextInt());

        System.out.println("Ingrese el año actual (ej: 2022)");
        m.setAnioI(leer.nextInt());

        int anioI = m.getAnioI();
        int mesI = m.getMesI();
        int fechaI = m.getFechaI();

        System.out.println("Usted ingreso: " + " " + fechaI + " del " + mesI + " del año " + anioI);

        return m;
    }

    public Date1 compararDatos(Date1 m, Date1 m2) {

        int anioI = m.getAnioI();
        int mesI = m.getMesI();
        int fechaI = m.getFechaI();

        int anio = m2.getAnio();
        int mes = m2.getMes() + 1;
        int fecha = m2.getFecha();
        int diferencia;
        
        if (fechaI == fecha) {
            if (mes == mesI) {
                if (anio == anioI) {
                    System.out.println("La fecha ingresada con la fecha actual SON iguales ");

                } else {
                    System.out.println("La fecha ingresada con la fecha actual NO son iguales 2");
                    System.out.print("La diferencia de años que hay entre la ingresada y la actual es: ");

                    if (anio > anioI) {
                        diferencia = anio - anioI;
                        System.out.println(diferencia + " años");
                    } else {
                        diferencia = anioI - anio;
                        System.out.println(diferencia + " años");
                    }

                }
            } else {
                System.out.println("La fecha ingresada con la fecha actual NO son iguales 3");

            }
        } else {
            System.out.println("La fecha ingresada con la fecha actual NO son iguales 4 ");

        }
        return m;
    }

}
