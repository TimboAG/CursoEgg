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
public abstract class Edificio {
    protected double ancho;
    protected double largo;
    protected double alto;

    public Edificio() {
    }

    public Edificio(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
       
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    private double calcularSuperficie(){
        double superficie;
        superficie = this.largo * this.ancho;
        return superficie;
    }
    
       private double calcularVolumen(){
        double volumen;
        volumen = this.alto * this.largo * this.ancho;
        return volumen;
    }

    @Override
    public String toString() {
        double volumen = this.calcularVolumen();
        double superficie = this.calcularSuperficie();
        return " ancho=" + ancho + ", largo=" + largo + ", alto=" + alto + " superficie= " + superficie + " volumen= " + volumen ;
    }
    
    
}
