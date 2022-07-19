/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer06;

import Servicio.TiendaServicio;
import Entidad.Tienda;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class ColeccionesEjer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TiendaServicio miServicio = new TiendaServicio();
        Tienda miTienda = new Tienda();
        HashMap miHash = miServicio.crearTienda(miTienda);
        miServicio.mostrarProducto(miHash);
        miServicio.buscarProducto(miHash);

    }

}
