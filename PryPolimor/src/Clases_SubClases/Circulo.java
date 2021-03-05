/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_SubClases;

import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class Circulo extends Figura2D {
private int radio;

    public Circulo(int radio,  int GrosorBorde, String color) {
        super(GrosorBorde, color);
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
  
    public int Cambiartamaño(){
        int area=0;
          
            area= (int) ((int) Math.pow(radio, 2)*(3.14));
            
    
    return area;}
}
