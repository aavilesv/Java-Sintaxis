/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prytareamatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author Jenny Bernal
 */
public class Matriz {

    private int indicefila;
    private int indiceColumna;
    private int tamañoFila;
    private int tamañoColumna;
    private int matriz[][];

    public Matriz() {
    }

    public Matriz(int tamañoColumna, int tamañoFila) {
        this.indicefila = 0;
        this.indiceColumna = 0;
        this.tamañoFila = tamañoFila;
        this.tamañoColumna = tamañoColumna;
        this.matriz = new int[tamañoColumna][tamañoFila];
    }

    public int getIndicefila() {
        return indicefila;
    }

    public int getIndiceColumna() {
        return indiceColumna;
    }

    public int getTamañoFila() {
        return tamañoFila;
    }

    public int getTamañoColumna() {
        return tamañoColumna;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setIndicefila(int indicefila) {
        this.indicefila = indicefila;
    }

    public void setIndiceColumna(int indiceColumna) {
        this.indiceColumna = indiceColumna;
    }

    public void setTamañoFila(int tamañoFila) {
        this.tamañoFila = tamañoFila;
    }

    public void setTamañoColumna(int tamañoColumna) {
        this.tamañoColumna = tamañoColumna;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void Ingresar() {
        int numero = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese en la posicion" + "[" + i + "]" + "[" + j + "]"));

                } while (!Repetido(numero));
                matriz[i][j] = numero;

            }
        }
    }
    //---------------------------------------------------------------------------------------------------
    //metodo Repetido  Tiene el paramentro que me permite ver el valor si esta en la matriz y que no se repita

    public boolean Repetido(int numero) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    JOptionPane.showMessageDialog(null, "Numero en la posicion" + "[" + i + "]" + "[" + j + "]");
                    return false;
                }
            }
        }
        return true;
    }
    //---------------------------------------------------------------------------------------------------
    //metodo Modificar Tiene el paramentro que me permite enviar el valor a modificar

    public boolean Modificar(int numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    while (!Repetido(numero)) {

                        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor que no este en la matriz"));
                    }
                    matriz[i][j] = numero;

                    JOptionPane.showMessageDialog(null, "Modificado en la posicion" + "[" + i + "]" + "[" + j + "]" + matriz[i][j]);
                    return false;
                }

            }
        }
        JOptionPane.showMessageDialog(null, "Numero a Modificar no existe en la Matriz");

        return true;
    }
    //---------------------------------------------------------------------------------------------------
    //metodo buscar Tiene el paramentro que me permite enviar el valor a buscar

    public boolean Buscar(int numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    indicefila = i;
                    indiceColumna = j;
                    JOptionPane.showMessageDialog(null, "Numero Encontrado" + "[" + i + "]" + "[" + j + "]" + matriz[i][j]);
                    return true;

                }
            }
        }
        JOptionPane.showMessageDialog(null, "Numero no encontrado");

        return false;
    }
    //---------------------------------------------------------------------------------------------------
    //metodo eliminar trabaja con el metodo buscar para poder funcionar si no llamo al metodo buscar el metodo eliminar se me va a ejercutar de la fila 0  a columna 0 hasta que termine la matriz 

    public void eliminar() {

        for (int i = indicefila; i < matriz.length; i++) {
            for (int j = indiceColumna; j < matriz[i].length; j++) {
                if (j == matriz[i].length - 1) {
                    if (i == matriz.length - 1) {
                        matriz[i][j] = 0;
                    } else {
                        indiceColumna = 0;
                        matriz[i][j] = matriz[indicefila + 1][indiceColumna];
                        indicefila++;
                    }
                } else {

                    matriz[i][j] = matriz[indicefila][indiceColumna + 1];
                    indiceColumna++;
                }
            }
        }
    }

    public String Presentar() {

        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                cadena += "[" + i + "]" + "[" + j + "]" + "   " + matriz[i][j];
            }
            cadena += "\n";
        }

        return cadena;
    }
}
