/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;
import entidad.AnimalEntidad;
import entidad.CaballoEntidad;
import entidad.GatoEntidad;
import entidad.PerroEntidad;
/**
 *
 * @author Usuario
 */
public class ServicioAnimales {
    
    public CaballoEntidad crearCaballo(){
        CaballoEntidad miCaballo = new CaballoEntidad();
        
        miCaballo.setEdad(10);
        miCaballo.setNombre("nombreCaballo");
        miCaballo.setRaza("razaCaballo");
        miCaballo.setAlimento("alimentoCaballo");
        
        return miCaballo;
    }
    public GatoEntidad crearGatoo(){
        GatoEntidad miGato = new GatoEntidad();
        
        miGato .setEdad(10);
        miGato .setNombre("nombreGato ");
        miGato .setRaza("razaGato ");
        miGato .setAlimento("alimentoGato ");
        
        return miGato ;
    }
    
     public PerroEntidad crearPerro(){
        PerroEntidad miPerro = new  PerroEntidad();
        
        miPerro .setEdad(10);
        miPerro .setNombre("nombremiPerro ");
        miPerro .setRaza("razamiPerro ");
        miPerro .setAlimento("alimentomiPerro ");
        
        return miPerro ;
    }
     
     public void mostrar(PerroEntidad miPerro, GatoEntidad miGato, CaballoEntidad miCaballo  ){
         
         miPerro.alimentar();
         miGato.alimentar();
         miCaballo.alimentar();
     }
     
}
