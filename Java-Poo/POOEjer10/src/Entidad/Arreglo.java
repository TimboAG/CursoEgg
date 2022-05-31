/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Sony-Pc
 */
public class Arreglo {

    private double[] A = new double[50];
    private double[] B = new double[20];

    public void mostrarA() {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    public void mostrarB() {
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }

    public Arreglo() {
    }

    public Arreglo(double[] A, double[] B) {
        this.A = A;
        this.B = B;
    }

    public double[] getA() {
        return A;
    }

    public void setA(double[] A) {
        
        this.A = A;
    }

    public double[] getB() {
        return B;
    }

    public void setB(double[] B) {
        this.B = B;
    }
    

}
