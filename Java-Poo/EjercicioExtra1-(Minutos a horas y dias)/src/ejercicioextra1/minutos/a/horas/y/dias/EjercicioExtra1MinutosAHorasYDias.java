/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1.minutos.a.horas.y.dias;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class EjercicioExtra1MinutosAHorasYDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    int minutos;
    int horas;
    int dias;
    int horasAux;
    
           System.out.println("Ingrese minutos:");
           minutos=leer.nextInt();
           
           
           dias= minutos/1440;
           horas=minutos/60;
           int n1;
           
           horasAux=horas -24;
               
               
            
          while(horasAux > 24){
                horasAux= horasAux - 24 ;
          }
           
           System.out.println("El equivalente de los minutos ingresados en dias y horas es: " + dias + " dias " + horasAux + " horas" );

    
    
    }
    
}
