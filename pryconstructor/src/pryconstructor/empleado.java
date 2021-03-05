
package pryconstructor;

public class empleado {
    private String nombre;
    private double Sueldo;
    private int edad;
    private double sueldoBase=2000.00;
    
    //metodos 
            //constructor 
    public empleado (){
        
        // inicializar los atributos  
        this.nombre= "jose";
        this.Sueldo=2154;
        this.edad=21;
        
        
    
    }
    public empleado ( String Nombre , double sueldo, int edad){
    this.nombre=Nombre;
    this.Sueldo=sueldo;
    this.edad=edad;
    
    }
    // metodos get 
    public String  getNombre(){
    
    return this.nombre;
    
    
    }public double getSueldo(){
    
    return this.Sueldo;
    
    }
    public int getEdad(){
    
    return this.edad;
    
    }
}
