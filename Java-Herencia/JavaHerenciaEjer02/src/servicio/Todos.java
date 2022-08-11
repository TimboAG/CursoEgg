/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;


import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;
import entidad.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Todos {

    public ArrayList<Electrodomestico> crearTodosArreglo() {
        ArrayList<Electrodomestico> miArray = new ArrayList();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantos electrodomesticos son:");
        int elec = leer.nextInt();
        int cont2 = 0;

        while (cont2 != elec) {
            System.out.println("Que desea ingresar? Lavadora o Televisor?");
            String opcionElect = leer.next();
            if (opcionElect.equalsIgnoreCase("televisor")) {
                if (miArray.size() < elec) {
                    cont2 = cont2 + 1;
                    Televisor miTelevisor = crearTelevisor();
                    miArray.add(miTelevisor);
                } else {
                    System.out.println("SE COMPLETARON LA CANTIDAD DE ELECTRODOMESTICOS INGRESADOS");
                    break;
                }
            }
            if (opcionElect.equalsIgnoreCase("lavadora")) {
                if (miArray.size() < elec) {
                    cont2 = cont2 + 1;
                    Lavadora milAVADORA = crearLavadora();
                    miArray.add(milAVADORA);
                } else {
                    System.out.println("SE COMPLETARON LA CANTIDAD DE ELECTRODOMESTICOS INGRESADOS");
                    break;
                }
            }

        }
        System.out.println("SE COMPLETARON LA CANTIDAD DE ELECTRODOMESTICOS INGRESADOS");

        return miArray;
    }

    public Televisor crearTelevisor() {
        TelevisorServicio TelevisorServicio = new TelevisorServicio();
        Televisor miTelevisor = TelevisorServicio.crearTelevisor();
        //TelevisorServicio.mostrar(miTelevisor);

        return miTelevisor;
    }

    public Lavadora crearLavadora() {
        LavadoraServicio miServicioL = new LavadoraServicio();
        Lavadora miLavadora = miServicioL.crearLavadora();
        //miServicioL.mostrar(miLavadora);
        return miLavadora;
    }

    public void mostrar(ArrayList<Electrodomestico> elec) {
        double precioTodos=0 ;

        for (int i = 0; i < elec.size(); i++) {
            precioTodos = precioTodos + elec.get(i).precioFinal();
        }

        System.out.println(elec);
        System.out.println("La suma del precio de todos los electrodomesticos es: $" + precioTodos);

    }

   
}
