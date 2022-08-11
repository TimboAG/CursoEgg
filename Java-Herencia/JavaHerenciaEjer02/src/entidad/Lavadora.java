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
public class Lavadora extends  Electrodomestico {
    protected double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, String consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    
    @Override
     public double precioFinal() {
     double precioF = super.precioFinal();
       if (this.carga > 30) {
            precioF = precioF + 500;
        }
       this.precio = precioF;
     return precioF;
     }

    @Override
    public String toString() {
        
        return "Lavadora{"+ "carga=" + carga + " "   + super.toString() + '}';
    }
    
    
    
}
