/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.Date;
/**
 *
 * @author Sony-Pc
 */
public class Date1 {

     private int dia;
    private int mes;
    private int anio;
    private int fecha;
    
    private int diaI;
    private int mesI;
    private int anioI;
    private int fechaI;

    public int getDiaI() {
        return diaI;
    }

    public void setDiaI(int diaI) {
        this.diaI = diaI;
    }

    public int getMesI() {
        return mesI;
    }

    public void setMesI(int mesI) {
        this.mesI = mesI;
    }

    public int getAnioI() {
        return anioI;
    }

    public void setAnioI(int anioI) {
        this.anioI = anioI;
    }

    public int getFechaI() {
        return fechaI;
    }

    public void setFechaI(int fechaI) {
        this.fechaI = fechaI;
    }

    
    public Date1() {
     
    }

    public Date1(int dia, int mes, int anio, int fecha, int diaI, int mesI, int anioI, int fechaI) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.fecha = fecha;
        this.diaI = diaI;
        this.mesI = mesI;
        this.anioI = anioI;
        this.fechaI = fechaI;
    }
    
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
     public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
   
    
}
