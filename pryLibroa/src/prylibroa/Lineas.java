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
public class Lineas {
        private int numeroLinea;
    private String Contenido;

    public Lineas() {
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public Lineas(int numeroLinea, String Contenido) {
        this.numeroLinea = numeroLinea;
        this.Contenido = Contenido;
    }

}
