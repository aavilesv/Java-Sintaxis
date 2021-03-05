/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero1;

import fichero1.datosPersona.datospersona;

/**
 *
 * @author GOYO
 */
public class persona_1 extends matriz {
        
        
    String Nombre;
    String Direccion;
    long numero;

    public persona_1(String Nombre, String Direccion, long numero, int fila, int columna) {
        super(fila, columna);
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.numero = numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public long getNumero() {
        return numero;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

   
}
