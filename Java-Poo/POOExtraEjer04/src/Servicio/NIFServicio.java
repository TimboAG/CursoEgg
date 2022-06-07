/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NIFServicio {

    public NIF crearNif() {
        NIF miNIF = new NIF();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un DNI");
        miNIF.setDni(leer.nextInt());
        return miNIF;
    }

    public void letra(NIF p) {
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int miLetra = p.getDni() % 23;
        for (int i = 0; i < miLetra-1; i++) {
            p.setLetra(letras[i]);
        }
        
        System.out.println(p.getLetra());
    }

    public void mostrar(NIF p) {

       String dni = String.valueOf(p.getDni());      
        System.out.println(dni.length());
        if ((p.getDni() > 0 && dni.length() == 8) ) {
            System.out.println(p.getDni() + "-" + p.getLetra());
        } else {
            System.out.println("El DNI ingresado no contiene 8 digitos");
        }
    }

    
}
