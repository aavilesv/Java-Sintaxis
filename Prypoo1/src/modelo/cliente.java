
package modelo;
public class cliente extends persona{
    private String fechaIngreso;
    private String telefono;

    public cliente() {
    }
    public cliente(String fechaIngreso, String telefono, int codigo, String nombre, String apellido, String cedula, int edad, int sexo) {
        super(codigo, nombre, apellido, cedula, edad, sexo);
        this.fechaIngreso = fechaIngreso;
        this.telefono = telefono;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
