/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TiendaServicio {

   public HashMap<String, Double> crearTienda(Tienda miTienda) {

        HashMap miHash = new HashMap();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc = 1;
        String opc2;

        while (opc != 0) {

            miTienda = crearProducto();
            miHash.put(miTienda.getProducto(), miTienda.getPrecio());

            System.out.println("Desea ingresar otro producto?");
            opc2 = leer.next();

            if ("S".equals(opc2) || "s".equals(opc2) || "Si".equals(opc2) || "si".equals(opc2)) {
                opc = 1;
            } else {
                opc = 0;
            }

        }

        return miHash;
    }


    
    
    
     
     
     
    public Tienda crearProducto() {
        Tienda miProducto = new Tienda();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String producto;
        double precio;

        System.out.println("Ingrese producto");
        producto = leer.next();

        System.out.println("Ingrese su precio");
        precio = leer.nextDouble();

        miProducto.setProducto(producto);
        miProducto.setPrecio(precio);

        return miProducto;
    }

    public void mostrarProducto(HashMap<String, Double> mi) {
        System.out.println(mi);
    }

  
    
    
    
    public void buscarProducto(HashMap<String, Double> mi) {

        String producto;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el producto que desea buscar");
        producto = leer.next();

        Iterator miMaps = mi.keySet().iterator();
        while (miMaps.hasNext()) {
            
            if (miMaps.next().equals(producto)) {
                miMaps.remove();
                System.out.println("El producto se ha borrado exitosamente");
            } else {
                System.out.println("No existe el producto");
            }
                   
        }

        System.out.println(mi);
    }

}
