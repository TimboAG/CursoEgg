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
public class Array {
    private String [] mes = new String[12];
   // private String [] mes ;
    private String mesSecreto;

    public Array(String[] mes, String mesSecreto) {
        this.mes = mes;
        this.mesSecreto = mesSecreto;
    }

    public Array() {
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    public void mostrarArray() {
        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i]);
        }
    }
    
     public void mostrarMesSecreto() {
       
            System.out.println(mesSecreto);
     }
}
