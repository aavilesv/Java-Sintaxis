/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_SubClases;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class DatosCubo extends Figura3D{
  

    public DatosCubo(  int GrosorBorde, String color) {
        super( GrosorBorde, color);
      
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
          
    public String CalularVolumen(){
     
  double iArista;
  double iVolumen;
        

  iArista = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la arista del cubo"));
    iVolumen = (int)Math.pow(iArista, 3);
    
        return "El volumen de un cubo de arista " + Double.toString(iArista) + " es de " + Double.toString(iVolumen);}
    
}
