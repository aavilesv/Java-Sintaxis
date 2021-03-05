
package dao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.cliente;
public class daocliente {
    
    public String crear(cliente d) {
        File arc = new File("src/fichero/cliente.txt");
        try {
            FileWriter escribirArchivo = new FileWriter(arc,true);
            BufferedWriter buffer = new BufferedWriter(escribirArchivo);
            buffer.write(
                    d.getCodigo() + ","
                    + d.getNombre() + ","
                    + d.getApellido() + ","
                    + d.getCedula() + ","
                    + d.getEdad() + ","
                    + d.getSexo() + ","
                    + d.getFechaIngreso()+ ","        
                    + d.getTelefono()
            );
            buffer.newLine();
            buffer.close();
        } catch (Exception e) {
            return "registro no guardado";
        }
        return "Registro guardado correctamente";
    }

    public String modificar(cliente d) {
        File arc = new File("src/fichero/cliente.txt");
        File aux = new File("src/fichero/auxcliente.txt");
        String linea = "";
        try {
            FileWriter escribirArchivo = new FileWriter(aux);
            BufferedWriter escribir = new BufferedWriter(escribirArchivo);
            FileReader leerArchivo = new FileReader(arc);
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null) {
                String[] datos = linea.split(",");
                if (Integer.parseInt(datos[0]) == d.getCodigo()) {
                    escribir.write(
                            d.getCodigo() + "," + d.getNombre() + ","
                            + d.getApellido() + "," + d.getCedula() + ","
                            + d.getEdad() + "," + d.getSexo() + "," 
                            + d.getFechaIngreso() + "," + d.getTelefono()
                    );
                    escribir.newLine();
                } else {
                    escribir.write(linea);
                    escribir.newLine();
                }
            }
            buffer.close();
            escribir.close();
        } catch (IOException | NumberFormatException e) {
            return "error al modificar el registro";
        }
        arc.delete();
        aux.renameTo(arc);
        return "Registro modificado correctamente";
    }

    public String eliminar(cliente d) {
        File arc = new File("src/fichero/cliente.txt");
        File aux = new File("src/fichero/auxcliente.txt");
        String linea = "";
        try {
            FileWriter escribirArchivo = new FileWriter(aux);
            BufferedWriter escribir = new BufferedWriter(escribirArchivo);
            FileReader leerArchivo = new FileReader(arc);
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null) {
                String[] datos = linea.split(",");
                if (Integer.parseInt(datos[0]) != d.getCodigo()) {
                    escribir.write(linea);
                    escribir.newLine();
                }
            }
            buffer.close();
            escribir.close();
        } catch (IOException | NumberFormatException e) {
            return "registro no eliminado";
        }
        arc.delete();
        aux.renameTo(arc);
        return "Registro eliminado correctamente";
    }
    
    
    public List<cliente> consultar() {
        File arc = new File("src/fichero/cliente.txt");
        String linea = "";
        List<cliente> listado = new ArrayList<>();
        try {
            FileReader leerArchivo = new FileReader(arc);
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null) {
                String[] datos = linea.split(",");
                cliente d = new cliente();
                d.setCodigo(Integer.parseInt(datos[0]));
                d.setNombre(datos[1]);
                d.setApellido(datos[2]);
                d.setCedula(datos[3]);
                d.setEdad(Integer.parseInt(datos[4]));
                d.setSexo(Integer.parseInt(datos[5]));
                d.setFechaIngreso(datos[6]);
                d.setTelefono(datos[7]);
                listado.add(d);
            }
            buffer.close();
        } catch (IOException | NumberFormatException e) {
        }
        return listado;
    }
    //aqui enviamos los datos a la tabla
    public void listar(JTable tabla, List<cliente> lstTrab) {
        String[] tit = new String[]{"Codigo","Nombre", "Apellido", "Cedula", "Edad", "Sexo", "fecha", "telefono"};
        DefaultTableModel modelo = new DefaultTableModel(null, tit);
        for (int i = 0; i < lstTrab.size(); i++) {
            Object[] objetos = new Object[8];
            objetos[0] = lstTrab.get(i).getCodigo();
            objetos[1] = lstTrab.get(i).getNombre();
            objetos[2] = lstTrab.get(i).getApellido();
            objetos[3] = lstTrab.get(i).getCedula();
            objetos[4] = lstTrab.get(i).getEdad();
            objetos[5] = (lstTrab.get(i).getSexo() == 1) ? "Masculino" : "Femenino";
            objetos[6] = lstTrab.get(i).getFechaIngreso();
            objetos[7] = lstTrab.get(i).getTelefono();
            modelo.addRow(objetos);
        }
        tabla.setModel(modelo);
        tabla.clearSelection();
    }
 
    //este sirve para buscar el registro atravez de la cedula
    public void buscar(JTable tabla, int columna, String filtro) {
        List<cliente> lstTrab = consultar();
        List<cliente> t = new ArrayList<>();
        for (int i = 0; i < lstTrab.size(); i++) {
            switch (columna) {
                
                case 1:
                    if (lstTrab.get(i).getCedula().contains(filtro)) {
                        t.add(lstTrab.get(i));
                        break;
                    }
               
            }
        }
        listar(tabla, t);
    }

   
    public int codigoGenerador() {
        File arc = new File("src/fichero/cliente.txt");
        String linea = "";
        int codigo = 0;
        try {
            FileReader leerArchivo = new FileReader(arc);
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null) {
                String[] datos = linea.split(",");
                codigo = Integer.parseInt(datos[0]);
            }
            buffer.close();
            codigo+=1;
        } catch (IOException | NumberFormatException e) {
        }
        return codigo;
    }
}
