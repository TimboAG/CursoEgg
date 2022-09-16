/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Libro;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import servicio.AutorServicio;
import servicio.EditorialServicio;

/**
 *
 * @author Usuario
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static EntityManager miEntity() {
        EntityManager em = Persistence.createEntityManagerFactory("Libreria").createEntityManager();
        return em;
    }

    public Libro consultaISBN(long isbn) {
        EntityManager em = miEntity();
        Libro miLibro = em.find(Libro.class, isbn);
        if (miLibro != null) {
            System.out.println(miLibro.toString());
        } else {
            System.out.println("No existe el isbn ingresado ");
        }
        em.close();
        return miLibro;
    }

    public static String consultaIdAutor(Integer id) {
        EntityManager em = miEntity();
        Collection<Libro> miLibro = em.createQuery("SELECT l "
                + " FROM Libro l "
                + " WHERE l.autor = (SELECT a FROM Autor a WHERE a.id = :id)").
                setParameter("id", id).
                getResultList();
        String libro = "";
        if (!miLibro.isEmpty()) {
            for (Libro l : miLibro) {
                libro = l.toString();
            }
        } else {
            libro = "No hay libros con ese autor";
        }
        em.close();
        return libro;
    }

    public static String consultaIdEditorial(Integer id) {
        EntityManager em = miEntity();
        Collection<Libro> miLibro = em.createQuery("SELECT l "
                + " FROM Libro l "
                + " WHERE l.editorial = (SELECT e FROM Editorial e WHERE e.id = :id)").
                setParameter("id", id).
                getResultList();
        String libro = "";
        if (!miLibro.isEmpty()) {
            for (Libro l : miLibro) {
                libro = l.toString();
            }
        } else {
            libro = "No hay libros con esa editorial";
        }
        em.close();
        return libro;
    }

    public static Collection<Libro> consultaTitulo(String titulo) {
        EntityManager em = miEntity();
        Collection<Libro> miLibro = em.createQuery("SELECT l "
                + " FROM Libro l "
                + " WHERE l.titulo = :titulo").
                setParameter("titulo", titulo).
                getResultList();
        if (!miLibro.isEmpty()) {
            for (Libro l : miLibro) {
                System.out.println(l.toString());
            }
        } else {
            System.out.println("No hay libros con ese titulo");
        }
        em.close();
        return miLibro;
    }

    public Collection<Libro> consultaTodos() {
        EntityManager em = miEntity();
        Collection<Libro> miLibro = em.createQuery("SELECT l "
                + " FROM Libro l").
                getResultList();
        if (!miLibro.isEmpty()) {
            for (Libro l : miLibro) {
                System.out.println(l.toString());
            }
        } else {
            System.out.println("No hay libros");
        }
        em.close();
        return miLibro;
    }

    public Libro crear() {
        EntityManager em = miEntity();
        Libro miLibro = new Libro();
        System.out.println("Ingrese el isbn del libro");
        miLibro.setIsbn(leer.nextLong());
        System.out.println("Ingrese el titulo del libro");
        miLibro.setTitulo(leer.next());
        System.out.println("Ingrese el año del libro");
        miLibro.setAnio(leer.nextInt());
        System.out.println("Ingrese Cantidad de ejemplares");
        miLibro.setEjemplares(leer.nextInt());
        System.out.println("Ingrese Cantidad de ejemplares prestados");
        miLibro.setEjemplaresPrestados(leer.nextInt());
        System.out.println("Ingrese alta (alta o baja)");
        String alta = leer.next();
        if ("alta".equalsIgnoreCase(alta)) {
            miLibro.setAlta(Boolean.TRUE);
        } else {
            miLibro.setAlta(Boolean.FALSE);
        }
        AutorServicio miAutor = new AutorServicio();
        miLibro.setAutor(miAutor.crear());
        EditorialServicio miEditorial = new EditorialServicio();
        miLibro.setEditorial(miEditorial.crear());
        Integer restantes = miLibro.getEjemplares() - miLibro.getEjemplaresPrestados();
        miLibro.setEjemplaresRestantes(restantes);
        em.getTransaction().begin();
        em.persist(miLibro);
        em.getTransaction().commit();
        em.close();
        return miLibro;
    }

    public Libro eliminar(String titulo) {
        EntityManager em = miEntity();
        Collection<Libro> miLibro = em.createQuery("SELECT l "
                + " FROM Libro l "
                + " WHERE l.titulo = :titulo").
                setParameter("titulo", titulo).
                getResultList();
        long codigo = 0;
        Libro miLibro2 = null;
        if (!miLibro.isEmpty()) {
            for (Libro l : miLibro) {
                codigo = l.getIsbn();
                miLibro2 = em.find(Libro.class, codigo);
                em.getTransaction().begin();
                em.remove(miLibro2);
                em.getTransaction().commit();
            }
            System.out.println("El/Los libros fueron eliminados correctamente");
        } else {
            System.out.println("No existe el tirulo del libro ingresado");
        }
        em.close();
        return miLibro2;
    }

    public Libro actualizar(String titulo) {
        EntityManager em = miEntity();
        long codigo = 0;
        Collection<Libro> miLibro = em.createQuery("SELECT l "
                + " FROM Libro l "
                + " WHERE l.titulo = :titulo").
                setParameter("titulo", titulo).
                getResultList();
        Libro miLibro2 = null;
        if (!miLibro.isEmpty()) {
            for (Libro l : miLibro) {
                codigo = l.getIsbn();
            }
            miLibro2 = em.find(Libro.class, codigo);
            System.out.println("Ingrese el titulo nuevo");
            miLibro2.setTitulo(leer.next());
            em.getTransaction().begin();
            em.merge(miLibro);
            em.getTransaction().commit();
        } else {
            System.out.println("No existe el tirulo del libro ingresado");
        }
        em.close();
        return miLibro2;
    }
}
