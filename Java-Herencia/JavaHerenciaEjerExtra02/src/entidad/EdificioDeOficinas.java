/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class EdificioDeOficinas extends Edificio {
    protected int numeroOficina;
    protected int numPersonas;
    protected int pisos;

    public EdificioDeOficinas() {
    }

 
    public EdificioDeOficinas(int numeroOficina, int numPersonas, int pisos, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.numeroOficina = numeroOficina;
        this.numPersonas = numPersonas;
        this.pisos = pisos;
    }

    public int getNumeroOficina() {
        return numeroOficina;
    }

    public void setNumeroOficina(int numeroOficina) {
        this.numeroOficina = numeroOficina;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
    private int cantPersonas(){
        int cantPersonas;
        cantPersonas = this.numeroOficina * this.numPersonas;
        return cantPersonas;
    }

    @Override
    public String toString() {
        int cantP = cantPersonas();
        return "EdificioDeOficinas{" + "numeroOficina=" + numeroOficina + ", numPersonas=" + numPersonas + ", pisos=" + pisos + super.toString() + " cantidad de personas por oficina= " + this.numPersonas + " cantidad de personas en el edificio = " + cantP + '}';
    }
    
    
}
