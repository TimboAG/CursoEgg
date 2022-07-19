/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Lenovo Gamers
 */
public class Ahorcado {

    private String[] buscar;
    private int conLetras;
    private int cantJugadasMax;
    private String[] mostrarPalabra;

    public Ahorcado() {
    }

    public Ahorcado(String[] buscar, int conLetras, int cantJugadasMax) {
        this.buscar = buscar;
        this.conLetras = conLetras;
        this.cantJugadasMax = cantJugadasMax;
        this.mostrarPalabra = mostrarPalabra;

    }

    public String[] getMostrarPalabra() {
        return mostrarPalabra;
    }
    
    

    public void setMostrarPalabra(String[] mostrarPalabra) {
        this.mostrarPalabra = mostrarPalabra;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "mostrarPalabra=" + mostrarPalabra + '}';
    }

    
    
   

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getConLetras() {
        return conLetras;
    }

    public void setConLetras(int conLetras) {
        this.conLetras = conLetras;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }

}
