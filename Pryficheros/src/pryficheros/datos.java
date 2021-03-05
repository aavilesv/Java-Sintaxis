/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryficheros;

/**
 *
 * @author GOYO
 */
public class datos {
    String nombre;
    String Apellido;
    int cedula;
    public void setnombre(String nombre){this.nombre=nombre;}
    public String getNombre(){
        return nombre;
        
}public void setApellido(String apellido){this.Apellido=apellido;}
public String getApellido(){return Apellido;}
public int getcedula(){return cedula;}

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }



}
