/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abelimin;

import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class elimniar {

    char yu[][];
    int tamañofila, indicefila;
    int tamañocolumna, indicecolumna;

    public elimniar(int fila, int columna) {
        this.tamañocolumna = columna;
        this.tamañofila = fila;
        this.yu = new char[fila][columna];
        this.indicecolumna = 0;
        this.tamañocolumna = 0;

    }

    public void ingresar(char a) {
        for (int i = 0; i < yu.length; i++) {
            for (int j = 0; j < yu[i].length; j++) {
                yu[i][j] = JOptionPane.showInputDialog("ingrese letra" + "[" + i + "]" + "[" + j + "]").charAt(0);
            }
        }
    }

    public String presentar() {
        String cade = "";
        for (int i = 0; i < yu.length; i++) {
            for (int j = 0; j < yu[i].length; j++) {
                cade += "  " + "[" + i + "]" + "[" + j + "]" + yu[i][j];
            }
            cade += "\n";
        }
        return cade;
    }

    public void buscar(char ae) {
        for (int i = 0; i < yu.length; i++) {
            for (int j = 0; j < yu[i].length; j++) {
                if (ae == yu[i][j]) {
                    indicecolumna = j;
                    indicefila = i;
                }
            }
        }
    }
public void metododelburbuja(){


}
    public void eliminar() {
        for (int i = indicefila; i < yu.length; i++) {
            for (int j = indicecolumna; j < yu[i].length; j++) {
                if (j == yu[i].length - 1) {
                    if (i == yu.length - 1) {
                        yu[i][j] = '0';
                    } else {
                        indicecolumna = 0;
                        yu[i][j] = yu[indicefila + 1][indicecolumna];
                        indicefila++;
                    }
                } else {

                    yu[i][j] = yu[indicefila][indicecolumna + 1];
                    indicecolumna++;
                }
            }
        }
    }
}
