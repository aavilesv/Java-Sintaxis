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
public class DatosCuadrado extends Figura2D{
    private int lado;

    public DatosCuadrado(int lado,  int GrosorBorde, String color) {
        super( GrosorBorde, color);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
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

    public void setLado(int lado) {
        this.lado = lado;
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
     area=(int)Math.pow(lado, 2);
        return area;}
    
}
