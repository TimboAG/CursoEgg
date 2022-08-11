/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.Scanner;
import entidad.Edificio;
import entidad.EdificioDeOficinas;
import entidad.Polideportivo;



/**
 *
 * @author Usuario
 */
public class Todo {
    
    public ArrayList<Edificio> crearTodosArreglo() {
        ArrayList<Edificio> miArray = new ArrayList();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantos edificios son:");
        int edif = leer.nextInt();
        int cont2 = 0;

        while (cont2 != edif) {
            System.out.println("Que desea ingresar? polideportivo o edificio de oficinas?");
            String opcionElect = leer.next();
            if (opcionElect.equalsIgnoreCase("polideportivo")) {
                if (miArray.size() < edif) {
                    cont2 = cont2 + 1;
                    Polideportivo miPolidep = crearPolideportivo();
                    miArray.add(miPolidep);
                } 
            }
            if (opcionElect.equalsIgnoreCase("edificio de oficinas")) {
                if (miArray.size() < edif) {
                    cont2 = cont2 + 1;
                    EdificioDeOficinas miOficina = crearOficina();
                    miArray.add(miOficina);
                } 
            }

        }
        System.out.println("SE COMPLETARON LA CANTIDAD DE EDIFICIOS INGRESADOS");

        return miArray;
    }

    public Polideportivo crearPolideportivo() {
        PolideportivoServicio PolidepServ = new PolideportivoServicio();
        Polideportivo miPilidep = PolidepServ.crearPolideportivo();

        return miPilidep;
    }

    public EdificioDeOficinas crearOficina() {
        OficinaServicio miOficinaServicio= new OficinaServicio();
        EdificioDeOficinas miOficina = miOficinaServicio.crearOficinas();
        return miOficina;
    }

    
    public void mostrar(ArrayList<Edificio> edif) {  
        System.out.println(edif);
    }

}
