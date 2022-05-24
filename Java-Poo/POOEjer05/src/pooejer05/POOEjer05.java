/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer05;
import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;
/**
 *
 * @author Sony-Pc
 */
public class POOEjer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        
        CuentaServicio nuevaCuenta = new CuentaServicio();
        Cuenta miCuenta = nuevaCuenta.crearCuenta();
        
        int opc;
        opc=0;
        
        
        do{
            
            System.out.println("------------ MENU ------------");
            System.out.println("1- Ingresar dinero");
            System.out.println("2- retirar dinero");
            System.out.println("3- Extraccion rapida");
            System.out.println("4- Ver informacion de mi cuenta");
            System.out.println("5- Salir");
            System.out.println("Elija una opcion: ");
            opc= leer.nextInt();
            
            switch (opc){
                
                case 1:  nuevaCuenta.ingresar(miCuenta);
                    break;
               case 2: nuevaCuenta.retirar(miCuenta);
                    break;
               case 3:  nuevaCuenta.extraccionRapida(miCuenta);
                    break;
               case 4:  System.out.println("Saldo actual: " + miCuenta.getSaldoActual() );
                        System.out.println("DNI: " + miCuenta.getDni());
                        System.out.println("Numero de cuenta: " + miCuenta.getNumeroCuenta());
                    break;
               default: System.out.println("Elijio la opcion Salir o ingreso un numero no valido");
                    
        }
            
        }while(opc !=5);
        
        
       
        
        
        
        


    }
    
}
