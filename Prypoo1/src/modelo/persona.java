
package modelo;
public class persona {
  protected int codigo;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected int edad;
    protected int sexo;

    public persona() {
    }
/*File cre=new File("C:\\Users\\GOYO\\Desktop\\fichero1\\src\\fichero1\\guardarfichero\\cliente.txt");
        try{
        
            FileWriter escribir=new FileWriter(cre);
        BufferedWriter er=new BufferedWriter(escribir);
        er.write(a.getDireccion()+","+a.getNombre()+", "+a.getNumero()+","+a.getSexo()+","+a.getCantidad());
        er.newLine();
        er.close();
        }catch (Exception e) {
            return "registro no guardado";
        }
        return "Registro guardado correctamente";
        
        }*/
    public persona(int codigo, String nombre, String apellido, String cedula, int edad, int sexo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.sexo = sexo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    
}
