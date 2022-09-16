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
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected String consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, String consumoEnergetico, double peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(String letra) {
        //private en la misma clase

        switch (letra.toUpperCase()) {
            case "A":
                this.consumoEnergetico = letra;
                break;
            case "B":
                 this.consumoEnergetico = letra;
                break;
            case "C":
                 this.consumoEnergetico = letra;
                break;
            case "D":
                 this.consumoEnergetico = letra;
                break;
            case "E":
                consumoEnergetico = letra;
                break;
            default:
                this.consumoEnergetico = "F";
                break;

        }

    }

    private void comprobarColor(String color) {
        //swicht con toUpperCase

        switch (color.toUpperCase()) {
            case "BLANCO":
                this.color = color;
                break;
            case "NEGRO":
                this.color = color;
                break;
            case "ROJO":
                this.color = color;
                break;
            case "AZUL":
                this.color = color;
                break;
            case "GRIS":
                this.color = color;
                break;
            default:
                this.color = "Blanco";

        }

        /*if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            this.color = color;
        } else {
            this.color = "Blanco";
        }*/
    }

    public double precioFinal() {

        switch (this.consumoEnergetico.toUpperCase()) {
            case "A":
                this.precio = precio + 1000;
                break;
            case "B":
                this.precio = precio + 800;
                break;
            case "C":
                this.precio = precio + 600;
                break;
            case "D":
                this.precio = precio + 500;
                break;
            case "E":
                this.precio = precio + 300;
                break;
            case "F":
                this.precio = precio + 100;
                break;
        }

        if (this.peso > 80) {
            this.precio = precio + 1000;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            this.precio = precio + 100;

        }
        if (this.peso >= 20 && this.peso <= 49) {
            this.precio = precio + 500;

        }

        if (this.peso >= 50 && this.peso <= 79) {
            this.precio = precio + 800;

        }

        return this.precio;
    }

    @Override
    public String toString() {
        double precioF = this.precio;
        return " color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "- El precio Final es: $" + precioF ;

    }

}
