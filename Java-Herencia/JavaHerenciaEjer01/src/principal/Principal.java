/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.CaballoEntidad;
import entidad.GatoEntidad;
import entidad.PerroEntidad;

import servicio.ServicioAnimales;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioAnimales miAnimales = new ServicioAnimales();
        CaballoEntidad miCaballo = miAnimales.crearCaballo();
        GatoEntidad miGato = miAnimales.crearGatoo();
        PerroEntidad miPerro = miAnimales.crearPerro();

        miAnimales.mostrar(miPerro, miGato, miCaballo);

    }

}
