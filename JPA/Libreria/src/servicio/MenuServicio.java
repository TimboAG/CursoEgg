/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import servicio.AutorServicio;
import servicio.EditorialServicio;
import servicio.LibroServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MenuServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu(){
        int opcion = 0;
        do {
            System.out.println("1-Búsqueda de un Autor por nombre");
            System.out.println("2-Búsqueda de un libro por ISBN");
            System.out.println("3-Búsqueda de un libro por Título");
            System.out.println("4-Búsqueda de un libro por nombre de autor");
            System.out.println("5-Búsqueda de un libro por nombre de editorial");
            System.out.println("6-Agregar libro");
            System.out.println("7-Eliminar Libro/s por nombre/s");
            System.out.println("8-Actualizar libro por titulo");
            System.out.println("9-Agregar editorial ");
            System.out.println("10-Agregar Autor");
            System.out.println("11-Consultar editorial por nombre");
            System.out.println("12-Consultar autor por nombre");
            System.out.println("13-Mostrar todos los libros");
            System.out.println("14-Salir");
            try {
                opcion = leer.nextInt();
                LibroServicio miLibro = new LibroServicio();
                AutorServicio miAutor = new AutorServicio();
                EditorialServicio miEditorial = new EditorialServicio();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre del autor a buscar");
                        miAutor.consultaAutor(leer.next());
                        break;
                    case 2:
                        System.out.println("Ingrese el ISBN a buscar");
                        miLibro.consultaISBN(leer.nextLong());
                        break;
                    case 3:
                        System.out.println("Ingrese el titulo del libro a buscar");
                        LibroServicio.consultaTitulo(leer.next());
                        break;
                    case 4:
                        System.out.println("Ingrese el nombre del autor a buscar");
                        miAutor.consultaLibroPorAutor(leer.next());
                        break;
                    case 5:
                        System.out.println("Ingrese el nombre de editorial para buscar sus libros");
                        miEditorial.consultaLibroPorEditorial(leer.next());
                        break;
                    case 6:
                        miLibro.crear();
                        break;
                    case 7:
                        System.out.println("Ingrese el titulo del libro a eliminar");
                        miLibro.eliminar(leer.next());
                        break;
                    case 8:
                        System.out.println("Ingrese el titulo del libro a actualizar");
                        miLibro.actualizar(leer.next());
                        break;
                    case 9:
                        miEditorial.crear();
                        break;
                    case 10:
                        miAutor.crear();
                        break;
                    case 11:
                        System.out.println("Ingrese el nombre de la editorial a buscar");
                        miEditorial.consultaNombre(leer.next());
                        break;
                    case 12:
                        break;
                    case 13:
                        miLibro.consultaTodos();
                        break;
                    default:
                        System.out.println("La opcion elegida es invalida");
                        break;
                }
            } catch (Exception e) {
                leer.next();
                System.out.println("Ha ocurrido un error : " + e.getMessage().getClass() + " programa finalizado");
            }

        } while (opcion != 0);
    }
}
