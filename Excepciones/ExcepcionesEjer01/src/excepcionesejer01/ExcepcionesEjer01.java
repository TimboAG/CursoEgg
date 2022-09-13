/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesejer01;

import servicio.Todo;

/**
 *
 * @author Usuario
 */
public class ExcepcionesEjer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //excepcion cuando se ingresa datos vacios
        try {

            Todo miTodos = new Todo();
            miTodos.todo();
            miTodos.mostrar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
