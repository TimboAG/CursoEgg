/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextraejer04;
import Entidad.NIF;
import Servicio.NIFServicio;

/**
 *
 * @author Usuario
 */
public class POOExtraEjer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NIFServicio miServicio =  new NIFServicio();
        NIF miNIF = miServicio.crearNif();
        
        miServicio.letra(miNIF);
        miServicio.mostrar(miNIF);
        
    }
    
}
