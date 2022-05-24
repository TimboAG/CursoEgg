/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01.claselibro;
import Entidad.Libro;
import ServicioLibro.ServicioLibro;


/**
 *
 * @author Usuario
 */



public class POOej01ClaseLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      System.out.println("------- INGRESO DE DATOS --------");
      ServicioLibro LibroServ = new ServicioLibro();
      Libro crear = LibroServ.crearLibro();
   
      System.out.println("------- MOSTRAR DATOS --------");

     // System.out.println(crear);
    LibroServ.mostrarLibro(crear);
    }
 


}
