/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryconstructor;

/**
 *
 * @author unemi
 */
public class Pryconstructor {

  
    public static void main(String[] args) {
        
        empleado p2= new empleado();// llama al contructor sin parametros  
        String nombre= "Maria ";
        double sueldo =150.12;
        int edad= 30;
        
        empleado p22= new empleado (nombre, sueldo , edad);
        
System.out.println("nombre:"+ p22.getNombre());
    System.out.println("sueldo: "+ p22.getSueldo());
    System.out.println("edad:" + p22.getEdad());
    System.out.println("nombre:"+ p2.getNombre());
    System.out.println("sueldo: "+ p2.getSueldo());
    System.out.println("edad:" + p2.getEdad());
    
    }
    
    
    
}
