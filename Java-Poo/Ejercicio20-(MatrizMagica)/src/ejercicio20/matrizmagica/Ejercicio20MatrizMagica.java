/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20.matrizmagica;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Ejercicio20MatrizMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    int  n, suma, suma2, suma3, suma4, cont,  i, j;
    
    n=3;
     int [][] matriz= new int[n][n]; 
     int [] aux1= new int[n]; 
     int [] aux2= new int[n]; 
     
   // System.out.println("Ingrese el tamaño de la matriz (no debe ser mayor a 10)");
   // n= leer.nextInt();
    
   
   if (n > 10 ){
       System.out.println("Se ingreso un numero no valido");
   }else{
       
   
    
   Random r = new Random();
   
   
    for (i=0; i<matriz.length; i++){
    for (j=0; j<matriz.length; j++){
       matriz[i][j] =  r.nextInt(2)+1;
    }  
  }


//  
//   for (i=0; i<matriz.length; i++){
//    for (j=0; j<matriz.length; j++){
//         System.out.println("Ingrese " + i + " numero:");
//       matriz[i][j] =  leer.nextInt();
//      }  
//    }




    
         System.out.println( "-----------MATRIZ CON NUMEROS ALEATORIOS------------ " ); 

    
    for (i=0; i<matriz.length; i++){
      for (j=0; j<matriz.length; j++){
       System.out.print( " " + matriz[i][j] ); 
      }  
        System.out.println( " "  ); 
    }
    
     System.out.println( "-----------------SUMAS------------------------ " ); 
     
     cont=0;
     suma=0;
     suma2=0;
     suma3=0;
     suma4=0;
     
     
     for (i=0; i<matriz.length; i++){
      for (j=0; j<matriz.length; j++){
      suma = suma + matriz[i][j];
      aux1[i]= suma;
      suma2 = suma2 + matriz[j][i];
      aux2[i]=suma2;
				
	if(i==j) {
            suma3 = suma3 + matriz[i][j];
        }
					
				
      } 
          System.out.println( "La suma de la fila " + i + " es: " + suma );  
          
          
          
             System.out.println( "La suma de la columna " + i + " es: " + suma2 );  
             if(suma == suma2){
              cont= cont+1;
          }
             suma=0;
             suma2=0;
      
    }
     
     
     for(i=0; i <matriz.length; i++ ){
       for(j=0; j < matriz.length; j++ ){
           
           if(i+j==n-1){
                suma4= suma4 + matriz[i][j];
           }
        
     }  
     }
	
     
       System.out.println( "La suma de la diagonal principal es:  " + suma3 ); 
        System.out.println( "La suma de la diagonal secundaria es:  " + suma4 ); 
     
    
         System.out.println( "-----------------¿ES MAGICA?------------------------ " ); 

       
   
    if(suma3 == suma4){
       cont=cont + 2;
   }
    
    
  for (i= 0; i < n-1; i++){
        
     if(aux1[i] == aux2[i]   ){
           cont=cont+1;
      } 
  }
    
    System.out.println( cont ); 
    
    if( cont == (n*2) + 1) {
        System.out.println("ES MAGICA");
    }else{
        System.out.println("NO ES MAGICA");
    }
    
    
    
    
    
    
    
    
    
    
    
    }
   
   
   
   
   
   
   
   
   
   
   
    }
    
}
