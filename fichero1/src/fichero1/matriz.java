/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero1;

import javax.swing.JOptionPane;
/**

 */
public class matriz {
        private int indicefila;
    private int indiceColumana;
    private int TamañoFila;
    private int TamañoColumna;
    private int matriz[][];

    public int getIndicefila() {
        return indicefila;
    }

    public int getIndiceColumana() {
        return indiceColumana;
    }

    public int getTamañoFila() {
        return TamañoFila;
    }

    public int getTamañoColumna() {
        return TamañoColumna;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setIndicefila(int indicefila) {
        this.indicefila = indicefila;
    }

    public void setIndiceColumana(int indiceColumana) {
        this.indiceColumana = indiceColumana;
    }

    public void setTamañoFila(int TamañoFila) {
        this.TamañoFila = TamañoFila;
    }

    public void setTamañoColumna(int TamañoColumna) {
        this.TamañoColumna = TamañoColumna;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public matriz(int fila, int columna) {
        this.matriz = new int[fila][columna];
        this.TamañoFila = fila;
        this.TamañoColumna = columna;
        indicefila = 0;
        indiceColumana = 0;
    }

    public void Ingresar() {
        int numero2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {

                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
                } while (numero(numero2));
                matriz[i][j] = numero2;
                indiceColumana++;
            }indicefila++;
        }
    }

    public boolean numero(int numero) {
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (numero == matriz[i][j]) {
                   JOptionPane.showMessageDialog(null, "numero repetido en la posicion"+"["+i+"]"+"["+j+"]"+matriz[i][j]); return true;
                }

            }
        }

        return false;
    }
}
