/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_SubClases;

/**
 *
 * @author GOYO
 */
public class Figura {
    protected String Nombre;
    protected int GrosorBorde;
    protected String color;

    public Figura( int GrosorBorde, String color) {
        this.Nombre = Nombre;
        this.GrosorBorde = GrosorBorde;
        this.color = color;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getGrosorBorde() {
        return GrosorBorde;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setGrosorBorde(int GrosorBorde) {
        this.GrosorBorde = GrosorBorde;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Dibujar(){
    
    };
}
