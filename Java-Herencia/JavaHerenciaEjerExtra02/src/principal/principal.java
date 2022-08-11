/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Edificio;
import java.util.ArrayList;
import servicio.Todo;

/**
 *
 * @author Usuario
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Todo  miTodo = new Todo();
    ArrayList <Edificio> miArray =  miTodo.crearTodosArreglo();
    miTodo.mostrar(miArray);
     
    }
    
}
