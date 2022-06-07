/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextraejer03;

import Entidad.Raiz;
import Servicio.RaizServicio;

/**
 *
 * @author Usuario
 */
public class POOExtraEjer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaizServicio miServicio = new RaizServicio();
        Raiz miRaiz = miServicio.crear();

     //  Raiz miRaiz = new Raiz(1,6,4);

        miServicio.calcular(miRaiz);

    }

}
