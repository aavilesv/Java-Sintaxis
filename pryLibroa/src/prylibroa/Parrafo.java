/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prylibroa;

/**
 *
 * @author unemi
 */
public class Parrafo {
    private int numeroParrafos;
        private int numeroLineas;

    public Parrafo(int NumeroParrafos, int numeroLineas) {
        this.numeroParrafos = NumeroParrafos;
        this.numeroLineas = numeroLineas;
    }

    public int getNumeroParrafos() {
        return numeroParrafos;
    }

    public int getNumeroLineas() {
        return numeroLineas;
    }

    public void setNumeroParrafos(int NumeroParrafos) {
        this.numeroParrafos = NumeroParrafos;
    }

    public void setNumeroLineas(int numeroLineas) {
        this.numeroLineas = numeroLineas;
    }

}
