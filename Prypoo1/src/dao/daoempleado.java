
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
import modelo.emp;
public class daoempleado {
    
   
    public String crear(emp v) {
        File arc = new File("src/fichero/empleado.txt");
        try {
            FileWriter escribirArchivo = new FileWriter(arc, true);
            BufferedWriter buffer = new BufferedWriter(escribirArchivo);
            buffer.write(
                    v.getCodigo() + ","
                    + v.getNombre() + ","
                    + v.getApellido() + ","
                    + v.getCedula() + ","
                    + v.getEdad() + ","
                    + v.getSexo() + ","
                    + v.getEspecialidad()
            );
            buffer.newLine();
            buffer.close();
        } catch (Exception e) {
            return "registro no guardado";
        }
        return "Registro guardado correctamente";
    }

    public String modificar(emp v) {
        File arc = new File("src/fichero/empleado.txt");
        File aux = new File("src/fichero/auxempleado.txt");
        String linea = "";
        try {
            FileWriter escribirArchivo = new FileWriter(aux);
            BufferedWriter escribir = new BufferedWriter(escribirArchivo);
            FileReader leerArchivo = new FileReader(arc);
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null) {
                String[] datos = linea.split(",");
                if (Integer.parseInt(datos[0]) == v.getCodigo()) {
                    escribir.write(
                            v.getCodigo() + "," + v.getNombre() + ","
                            + v.getApellido() + "," + v.getCedula() + ","
                            + v.getEdad() + "," + v.getSexo() + "," 
                            + v.getEspecialidad()
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

    
    public String eliminar(emp v) {
        File arc = new File("src/fichero/empleado.txt");
        File aux = new File("src/fichero/auxempleado.txt");
        String linea = "";
        try {
            FileWriter escribirArchivo = new FileWriter(aux);
            BufferedWriter escribir = new BufferedWriter(escribirArchivo);
            FileReader leerArchivo = new FileReader(arc);
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null) {
                String[] datos = linea.split(",");
                if (Integer.parseInt(datos[0]) != v.getCodigo()) {
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
    
    
    
    public List<emp> consultar() {
        File arc = new File("src/fichero/empleado.txt");
        String linea = "";
        List<emp> listado = new ArrayList<>();
        try {
            FileReader leerArchivo = new FileReader(arc);
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null) {
                String[] datos = linea.split(",");
                emp v = new emp();
                v.setCodigo(Integer.parseInt(datos[0]));
                v.setNombre(datos[1]);
                v.setApellido(datos[2]);
                v.setCedula(datos[3]);
                v.setEdad(Integer.parseInt(datos[4]));
                v.setSexo(Integer.parseInt(datos[5]));
                v.setEspecialidad(datos[6]);
                listado.add(v);
            }
            buffer.close();
        } catch (IOException | NumberFormatException e) {
        }
        return listado;
    }
    

    public void listar(JTable tabla, List<emp> lstTrab) {
        String[] tit = new String[]{"Codigo","Nombre", "Apellido", "Cedula", "Edad", "Sexo", "Especialidad"};
        DefaultTableModel modelo = new DefaultTableModel(null, tit);
        for (int i = 0; i < lstTrab.size(); i++) {
            Object[] objetos = new Object[7];
            objetos[0] = lstTrab.get(i).getCodigo();
            objetos[1] = lstTrab.get(i).getNombre();
            objetos[2] = lstTrab.get(i).getApellido();
            objetos[3] = lstTrab.get(i).getCedula();
            objetos[4] = lstTrab.get(i).getEdad();
            objetos[5] = (lstTrab.get(i).getSexo() == 1) ? "Masculino" : "Femenino";
            objetos[6] = lstTrab.get(i).getEspecialidad();
            modelo.addRow(objetos);
        }
        tabla.setModel(modelo);
        tabla.clearSelection();
    }

    public void buscar(JTable tabla, int columna, String filtro) {
        List<emp> lstTrab = consultar();
        List<emp> v = new ArrayList<>();
        for (int i = 0; i < lstTrab.size(); i++) {
            switch (columna) {
                
                case 1:
                    if (lstTrab.get(i).getCedula().contains(filtro)) {
                        v.add(lstTrab.get(i));
                        break;
                    }
                               
            }
        }
        listar(tabla, v);
    }

   
    public int codigoGenerador() {
        File arc = new File("src/fichero/empleado.txt");
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
