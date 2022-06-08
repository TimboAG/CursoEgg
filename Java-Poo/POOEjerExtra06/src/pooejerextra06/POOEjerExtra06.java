/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerextra06;
import Servicio.ArrayServicio;
import Entidad.Array;
/**
 *
 * @author Usuario
 */
public class POOEjerExtra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ArrayServicio miServicio = new ArrayServicio();
Array miArray = miServicio.crearArray();

miServicio.miMesSecreto(miArray);

    }
    
}
