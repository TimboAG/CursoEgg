/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer03;
import Entidad.Operacion;
import Servicio.ServicioOperacion;
/**
 *
 * @author Sony-Pc
 */
public class POOEjer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ServicioOperacion crearO = new ServicioOperacion();
        Operacion crearOpe = crearO.crearOperacion();
        
       
        crearO.sumar(crearOpe);
        crearO.restar(crearOpe);
        crearO.multiplicar(crearOpe);
        crearO.dividir(crearOpe);


    }
    
}
