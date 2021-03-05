/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryayudantias;

/**
 *
 * @author unemi
 */
public class Matriz {

    private int tamañofila;
    private int tamañocolumna;
    private int indicecoluma;
    private int indicefila;
    private int[][] matriz;

    public Matriz(int tfila, int tcolumna) {
        this.tamañofila = tfila;
        this.tamañocolumna = tcolumna;
        this.indicefila = 0;
        this.indicecoluma = 0;
        matriz = new int[tamañofila][tamañocolumna];
    }

    public int getIndicecoluma() {
        return indicecoluma;
    }

    public int getIndicefila() {
        return indicefila;
    }

    public boolean llenarmatriz(int valor) {

        /*
         if (indicefila<tamañofila-1){
    
    
         if (indicecoluma<tamañocolumna-1){
         matriz[indicefila][indicecoluma]=valor;
         indicecoluma++;
         return true;
    
         }else{
         indicefila++;
         indicecoluma=0;
    
         }
         }return false;
         */
        matriz[indicefila][indicecoluma] = valor;
        indicecoluma += 1;
        if (indicecoluma == tamañocolumna) {

            indicecoluma = 0;
            indicefila += 1;
        }
        if (indicefila == tamañofila) {
            return false;

        } else {
            return true;
        }

    }

    public boolean buscar(int valor) {
        for (int i = 0; i < tamañofila; i++) {
            for (int a = 0; a < tamañocolumna; a++) {
                if (matriz[i][a] == valor) {
                    indicefila = i;
                    indicecoluma = a;
                    return true;

                }

            }
        }

        return false;
    }

    public String presentar() {

        String cadena = "";
        for (int i = 0; i < tamañofila; i++) {
            for (int a = 0; a < tamañocolumna; a++) {

                cadena += "[" + i + "]" + "[" + a + "]"+"      " + matriz[i][a];
            }
            cadena += "\n";
        }

        return cadena;
    }

    public void elimnar() {
        
        
        for (int i = indicecoluma; i < tamañocolumna; i++) {
            if (indicefila == tamañofila - 1) {
                if (i == tamañocolumna-1) {
                    matriz[indicefila][i] = 0;
                    break;
                } else {
                    matriz[indicefila][i] = matriz[indicefila][i + 1];

                }

            } else {
                if (i == tamañocolumna - 1) {
                    matriz[indicefila][i] = matriz[indicefila + 1][0];
                    indicefila = indicefila + 1;
                    i = -1;

                } else {

                    matriz[indicefila][i] = matriz[indicefila][i + 1];

                }

            }
        }

    }

}
