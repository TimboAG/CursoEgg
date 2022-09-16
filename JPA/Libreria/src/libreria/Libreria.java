/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import entidad.Libro;
import servicio.MenuServicio;

/**
 *
 * @author Usuario
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            MenuServicio miMenu = new MenuServicio();
            miMenu.menu();
        } catch (Exception e) {
                System.out.println("Ha ocurrido un error : " + e.getMessage().getClass() + " programa finalizado");
        }

    }

}
