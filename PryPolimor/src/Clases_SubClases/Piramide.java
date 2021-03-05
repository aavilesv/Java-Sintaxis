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
public class Piramide extends Figura3D{
    private int altura;
   

    public Piramide(int altura, int GrosorBorde, String color) {
        super( GrosorBorde, color);
        this.altura = altura;
      
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
 public int CalcularVolumen(){
     int volumen=0; 
     int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce el base de la piramide"));; 
      int area=0;
     
    area=(base*altura)/2;
    volumen=(area*altura)/3;
    
     return volumen;}

}
