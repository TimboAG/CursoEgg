/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer05;

import Entidad.Pais;
import Servicio.PaisServicio;
import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class ColeccionesEjer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio miServicio = new PaisServicio();
        HashSet<Pais> miHash = miServicio.inicio();
        miServicio.mostrar(miHash);

    }

}
