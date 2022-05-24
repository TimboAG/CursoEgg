/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


/**
 *
 * @author Usuario
 */
public class Libro {
    
    
    
    public String ISBN;
        public String titulo;
            public String autor;
                public int numPags;
                
                
                
                
public Libro(String ISBN, String titulo,String autor, int numPags ){
    this.ISBN= ISBN;
     this.titulo= titulo;
      this.autor= autor;
       this.numPags= numPags;
}

    


public Libro(){
 
}

    @Override
    public String toString() {
        return "El ISBN del libro es: " + ISBN + "\n" + "El titulo es: " + titulo + "\n" + "Su autor es: " + autor + "\n" + "Cantidad de paginas:" + numPags + "\n" ;
    }



    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    



}
