/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero1;

/**
 *
 * @author GOYO
 */
public class cliente extends persona_1 {
    String Sexo;
    long Cantidad;

    public String getSexo() {
        return Sexo;
    }

    public long getCantidad() {
        return Cantidad;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public cliente(String Sexo, long Cantidad, String Nombre, String Direccion, long numero, int fila, int columna) {
        super(Nombre, Direccion, numero, fila, columna);
        this.Sexo = Sexo;
        this.Cantidad = Cantidad;
    }

    
}
