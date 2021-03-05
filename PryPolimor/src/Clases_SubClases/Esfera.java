/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_SubClases;

/**
 *
 */
public class Esfera extends Figura3D{
    private int radio;

    public Esfera(int radio,  int GrosorBorde, String color) {
        super( GrosorBorde, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
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

    public void setRadio(int radio) {
        this.radio = radio;
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
    
        public int CalularVolumen(){
            int Volumen=0; int elevar=(int)Math.pow(radio, 3);
            Volumen=4/3*(int)(3.14 *elevar);
            return Volumen;}

}
