/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer11;

import java.util.Date;
import Entidad.Date1;
import Servicio.DateServicio;

/**
 *
 * @author Sony-Pc
 */
public class POOEjer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateServicio miServicio = new DateServicio();
        Date1 miDate = new Date1();

        Date d = new Date();
        System.out.println("*********************");

       Date1 miDate2 = miServicio.crearDatePersona();

        miDate.setMes(d.getMonth());
        miDate.setDia(d.getDay());
        miDate.setFecha(d.getDate());
        miDate.setAnio(d.getYear()+ 1900);

        System.out.println("*********************");

        Date1 miDate3 = miServicio.crearDate(miDate);
        System.out.println("*********************");
        miServicio.compararDatos(miDate2, miDate3);
    }

}
