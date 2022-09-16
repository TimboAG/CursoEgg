/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Editorial;
import entidad.Libro;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import servicio.LibroServicio;

/**
 *
 * @author Usuario
 */
public class EditorialServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static EntityManager miEntity() {
        EntityManager em = Persistence.createEntityManagerFactory("Libreria").createEntityManager();
        return em;
    }

    public void consultaLibroPorEditorial(String nombre) {
        EntityManager em = miEntity();
        Collection<Editorial> miEditorial = em.createQuery("SELECT e "
                + " FROM Editorial e "
                + " WHERE e.nombre = :nombre").
                setParameter("nombre", nombre).
                getResultList();
        Integer idEditorial = 0;
        if (!miEditorial.isEmpty()) {
            for (Editorial e : miEditorial) {
                idEditorial = e.getId();
                String miLibroEditorial = LibroServicio.consultaIdEditorial(idEditorial);
                if (miLibroEditorial.equalsIgnoreCase("No hay libros con esa editorial")) {
                } else {
                    System.out.println(LibroServicio.consultaIdEditorial(idEditorial));
                }
            }
        } else {
            System.out.println("El autor ingresado no existe");
        }
        em.close();
    }

    public Editorial consultaNombreLibro(String nombre) {
        EntityManager em = miEntity();
        Collection<Libro> consultaTitulo = LibroServicio.consultaTitulo(nombre);
        Integer idEditorial = 0;
        Editorial miEditorial = null;
        if (!consultaTitulo.isEmpty()) {
            for (Libro l : consultaTitulo) {
                idEditorial = l.getEditorial().getId();
                System.out.println(l.toString());
            }
            miEditorial = em.find(Editorial.class, idEditorial);
            System.out.println(miEditorial.toString());
        } else {
            System.out.println("No hay libros con ese titulo");
        }
        em.close();
        return miEditorial;
    }

    public Editorial crear() {
        EntityManager em = miEntity();
        Editorial miEditorial = new Editorial();
        System.out.println("Ingrese nombre de la editorial");
        miEditorial.setNombre(leer.next());
        System.out.println("Ingrese alta (alta o baja)");
        String alta = leer.next();
        if ("alta".equalsIgnoreCase(alta)) {
            miEditorial.setAlta(Boolean.TRUE);
        } else {
            miEditorial.setAlta(Boolean.FALSE);
        }
        em.getTransaction().begin();
        em.persist(miEditorial);
        em.getTransaction().commit();
        return miEditorial;
    }

    public Collection<Editorial> consultaNombre(String nombre) {
        EntityManager em = miEntity();
        Collection<Editorial> miEditorial = em.createQuery("SELECT l "
                + " FROM Editorial e "
                + " WHERE e.nombre = :nombre").
                setParameter("nombre", nombre).
                getResultList();
        if (!miEditorial.isEmpty()) {
            for (Editorial e : miEditorial) {
                System.out.println(e.getId());
                System.out.println(e.getNombre());
            }
        } else {
            System.out.println("No existe el nombre de la editorial ingresada");
        }
        em.close();
        return miEditorial;
    }
}
