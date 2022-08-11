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
  public class Circulo implements calculosFormas {
    protected double radio;
    protected double diametro;


    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double area() {
       double area = PI * Math.pow(radio,2);
       return area;
    }

    @Override
    public double perimetro() {
        double perimetro= PI * diametro;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + " Su area es: " + area() + '}';
    }
            
    
   
}
