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
public class Pagina {
      private int NumeroParrafos;
    private int numero;

    public Pagina() {
    }

    public Pagina(int NumeroParrafos, int numero) {
        this.NumeroParrafos = NumeroParrafos;
        this.numero = numero;
    }

    public int getNumeroParrafos() {
        return NumeroParrafos;
    }

   
    public int getNumero() {
        return numero;
    }

    public void setContenido(int NumeroParrafos) {
        this.NumeroParrafos = NumeroParrafos;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
