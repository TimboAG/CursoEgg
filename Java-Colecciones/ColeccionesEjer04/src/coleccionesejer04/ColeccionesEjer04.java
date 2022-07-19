/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer04;
import Entidad.Cine;
import Servicio.CineServicio;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ColeccionesEjer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CineServicio miServicio =  new CineServicio();
        ArrayList <Cine> miCine = miServicio.peliculas();
        miServicio.mostrar(miCine);

    }
    
}
