/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;

/**
 *
 * @author Usuario
 */
public class CadenaServicio {

    public int mostrarVocales(Cadena frase) {

        int conta = 0;
        int conte = 0;
        int conti = 0;
        int conto = 0;
        int contu = 0;
        int contTotal = 0;

        String cadena = frase.getFrase();
        String[] cadena2 = new String[frase.getFrase().length()];

        for (int i = 0; i < cadena.length(); i++) {
            cadena2[i] = cadena.substring(i, i + 1);
        }

        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena2[i]) {
                case "a":
                    conta = conta + 1;
                    break;
                case "A":
                    conta = conta + 1;
                    break;
                case "e":
                    conte = conte + 1;
                    break;
                case "E":
                    conte = conte + 1;
                    break;
                case "i":
                    conti = conti + 1;
                    break;
                case "I":
                    conti = conti + 1;
                    break;
                case "o":
                    conto = conto + 1;
                    break;
                case "O":
                    conto = conto + 1;
                    break;
                case "u":
                    contu = contu + 1;
                    break;
                case "U":
                    contu = contu + 1;
                    break;
            }

        }

        contTotal = conta + conte + conti + conto + contu;
        System.out.println("La cantidad de letras A que hay en la frase: " + conta);
        System.out.println("La cantidad de letras E que hay en la frase: " + conte);
        System.out.println("La cantidad de letras I que hay en la frase: " + conti);
        System.out.println("La cantidad de letras O que hay en la frase: " + conto);
        System.out.println("La cantidad de letras U que hay en la frase: " + contu);
        System.out.println("La cantidad de vocales total que hay en la frase: " + contTotal);

        return contTotal;
    }

    public void invertirFrase(Cadena frase) {
        String cadena = frase.getFrase();

        String invertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }

        System.out.println("******************************");
        System.out.println("frase ingresada: " + cadena);
        System.out.println("frase invertida: " + invertida);
        System.out.println("******************************");
    }

    public void vecesRepetido(String letra, Cadena frase) {

        int cont;
        String cadena = frase.getFrase();
        String[] cadena2 = new String[frase.getFrase().length()];

        for (int i = 0; i < cadena.length(); i++) {
            cadena2[i] = cadena.substring(i, i + 1);
        }

        cont = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena2[i].equalsIgnoreCase(letra) == true) {
                cont = cont + 1;
            }
        }

        System.out.println("******************************");
        System.out.println("En la frase ingresada la letra " + letra + " se repite: " + cont);

    }

    public void compararLongitud(String frase2, int frase) {

        System.out.println("******************************");
        if (frase == frase2.length()) {
            System.out.println("La primer frase ingresada tiene la misma longitud que la segunda frase ingresada");
        } else {
            System.out.println("La primer frase ingresada NO tiene la misma longitud que la segunda frase ingresada");
        }

    }

    public void unirFrases(String frase1, Cadena frase) {

        String cadena = frase.getFrase();

        System.out.println("La frase unidas es: " + cadena.concat(frase1));

    }

    public void reemplazar(String letra, String frase1, Cadena frase) {

        String fraseOriginal = frase.getFrase();
        String[] fraseOriginaVector = new String[frase.getFrase().length()];

        String[] SegundaFraseVector = new String[frase1.length()];

        for (int i = 0; i < fraseOriginal.length(); i++) {
            fraseOriginaVector[i] = fraseOriginal.substring(i, i + 1);
        }

        for (int i = 0; i < frase1.length(); i++) {
            SegundaFraseVector[i] = frase1.substring(i, i + 1);
        }

        System.out.println("******************************");

        System.out.println("La primer frase ingresada con las letras A reemplazadas por " + letra + " es: ");
        for (int i = 0; i < fraseOriginal.length(); i++) {
            if (fraseOriginaVector[i].equals("a") == true) {
                fraseOriginaVector[i] = letra;
            }
            System.out.print(fraseOriginaVector[i]);
        }

        System.out.println("  ");

        System.out.println("La segunda frase ingresada con las letras A reemplazadas por " + letra + " es: ");
        for (int i = 0; i < frase1.length(); i++) {
            if (SegundaFraseVector[i].equals("a") == true) {
                SegundaFraseVector[i] = letra;
            }
            System.out.print(SegundaFraseVector[i]);
        }
    }

}
