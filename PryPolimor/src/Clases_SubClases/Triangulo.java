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
public class Triangulo extends Figura2D{
    private int base;
    private int altura;

    public Triangulo(int base, int altura,  int GrosorBorde, String color) {
        super( GrosorBorde, color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
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

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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
    
      public int Cambiartamaño(){int area=0;
      area=(base*altura)/2;
      return area;}

}
