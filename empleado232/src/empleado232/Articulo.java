/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado232;

/**
 *
 * @author unemi
 */
public class Articulo {
    private String Nombre;
    private int cantidad;
    private short cedula;
    private double precio;
    

    //metodos 

    public Articulo() {
        this.Nombre = "angelo ";
        
        this.cantidad = 25;
        this.cedula=927;
        this.precio = 255.2;
        
    }

    public Articulo(String Nombre, short cedula  ) {
        this.Nombre = Nombre;
        this.cedula=cedula;
        
    }

    public Articulo(String Nombre, int cantidad) {
        this.Nombre = Nombre;
        this.cantidad = cantidad;
    }

    public Articulo(String Nombre, int cantidad, double precio) {
        this.Nombre = Nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    Articulo(String nombre, String cantidaad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public String getNombre(){
return this.Nombre;

}
public int getcantidad(){
return this.cantidad;
}
public double getprecio(){
return this.precio;
}

    public short getCedula() {
        return this.cedula;
    }

    
}






