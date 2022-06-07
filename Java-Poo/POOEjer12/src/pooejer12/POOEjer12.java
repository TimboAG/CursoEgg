/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer12;

import java.util.Scanner;
import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Usuario
 */
public class POOEjer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio n = new PersonaServicio();
        Persona m = n.crearPersona();

        n.calcularEdad(m);

        Scanner leer = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Ingrese una edad");
        int edad = leer.nextInt();

        n.menorQue(edad, m);
        n.mostrarPersona(edad, m);
    }

}
