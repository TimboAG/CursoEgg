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
public class Televisor extends  Electrodomestico  {
    protected double pulgadas;
    protected boolean sintonizador;

    public Televisor() {
    }

  
    public Televisor(double pulgadas, boolean sintonizador, double precio, String color, String consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    
    
    
    @Override
    public String toString() {
        String opcion= "Si";
        if(sintonizador == true){
            opcion= "Si"; 
        }else{
             opcion= "No";
        }
        return "Televisor{" + "pulgadas=" + pulgadas + ", sintonizador=" + opcion   + super.toString() + '}';
    }
    
    @Override
     public double precioFinal() {
     double precioF = super.precioFinal();
       if (this.pulgadas > 40) {
            precioF = precioF + (precioF * 0.30);
            
        }
       if (this.sintonizador == true) {
            precioF = precioF + 500;
        }
       
       this.precio = precioF;
     return precioF;
     }
    
}
