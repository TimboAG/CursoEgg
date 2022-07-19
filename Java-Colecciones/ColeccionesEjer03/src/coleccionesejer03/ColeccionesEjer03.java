/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer03;

import Entidad.Alumno;
import Servicio.AlumnoServicio;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ColeccionesEjer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AlumnoServicio miServicio = new AlumnoServicio();
        ArrayList<Alumno> miAlumno = miServicio.mi();
        miServicio.notaFinal(miAlumno);

    }

}
