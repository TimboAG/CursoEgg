/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer09;

import java.util.Scanner;
import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author Sony-Pc
 */
public class POOEjer09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        MatematicaServicio miNum = new MatematicaServicio();
        Matematica miNumeros = new Matematica();

        System.out.println("Ingrese un numero");
        miNumeros.setNum1(leer.nextDouble());
        System.out.println("Ingrese otro numero");
        miNumeros.setNum2(leer.nextDouble());

        System.out.println("--------------------------------");
        miNum.devolverMayor(miNumeros, miNumeros);
        System.out.println("--------------------------------");
        miNum.calcularPotencia(miNumeros, miNumeros);
        System.out.println("--------------------------------");
        miNum.calculaRaiz(miNumeros, miNumeros);

    }

}
