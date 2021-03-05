
package modelo;
public class emp extends persona{
   private String especialidad;

    public emp() {
    }

    public emp(String especialidad, int codigo, String nombre, String apellido, String cedula, int edad, int sexo) {
        super(codigo, nombre, apellido, cedula, edad, sexo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
