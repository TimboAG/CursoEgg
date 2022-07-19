/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Perros {
   private ArrayList <String> perros ;

    public Perros() {
    }

    public Perros(ArrayList<String> perros) {
        this.perros = perros;
    }

    public ArrayList<String> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<String> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return  "perros=" + perros ;
    }
    
   
    
}
