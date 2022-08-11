/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.calculosFormas;
import entidad.Circulo;
import entidad.Rectangulo;

/**
 *
 * @author Usuario
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circulo miCirculo = new Circulo(12, 23);
        System.out.println(miCirculo.area()); 
        System.out.println( miCirculo.perimetro());
        System.out.println(miCirculo.toString()); 

        Rectangulo miRectangulo = new Rectangulo(12, 23);
        System.out.println(miRectangulo.area());
        System.out.println( miRectangulo.perimetro());
        System.out.println(miRectangulo.toString());
        

    }

}
