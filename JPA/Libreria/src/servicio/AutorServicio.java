package servicio;

import entidad.Autor;
import entidad.Libro;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import servicio.LibroServicio;

public class AutorServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static EntityManager miEntity() {
        EntityManager em = Persistence.createEntityManagerFactory("Libreria").createEntityManager();
        return em;
    }

    public void consultaLibroPorAutor(String nombre) {
        EntityManager em = miEntity();
        Collection<Autor> miAutor = em.createQuery("SELECT a "
                + " FROM Autor a "
                + " WHERE a.nombre = :nombre").
                setParameter("nombre", nombre).
                getResultList();
        Integer idAutor = 0;
        if (!miAutor.isEmpty()) {
            for (Autor a : miAutor) {
                idAutor = a.getId();
                String miLibroAutor = LibroServicio.consultaIdAutor(idAutor);
                if (miLibroAutor.equalsIgnoreCase("No hay libros con ese autor")) {
                } else {
                    System.out.println(LibroServicio.consultaIdAutor(idAutor));
                }
            }
        } else {
            System.out.println("El autor ingresado no existe");
        }
        em.close();
    }

    public Collection<Autor> consultaAutor(String nombre) {
        EntityManager em = miEntity();
        Collection<Autor> miAutor = em.createQuery("SELECT a "
                + " FROM Autor a "
                + " WHERE a.nombre = :nombre").
                setParameter("nombre", nombre).
                getResultList();
        if (!miAutor.isEmpty()) {
            for (Autor a : miAutor) {
                System.out.println(a.getId());
                System.out.println(a.getNombre());
            }
        } else {
            System.out.println("El autor ingresado no existe");
        }
        em.close();
        return miAutor;
    }

    public Autor crear() {
        EntityManager em = miEntity();
        Autor miAutor = new Autor();
        System.out.println("Ingrese nombre del autor");
        miAutor.setNombre(leer.next());
        System.out.println("Ingrese alta (alta o baja)");
        String alta = leer.next();
        if ("alta".equalsIgnoreCase(alta)) {
            miAutor.setAlta(Boolean.TRUE);
        } else {
            miAutor.setAlta(Boolean.FALSE);
        }
        em.getTransaction().begin();
        em.persist(miAutor);
        em.getTransaction().commit();
        return miAutor;
    }

}
