
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
import modelo.prod;
public class daoproducto {
    
   public String crear(prod m) {
        File arc = new File("src/archivos/alimento.txt");
        try {
            FileWriter escribirArchivo = new FileWriter(arc, true);
            BufferedWriter buffer = new BufferedWriter(escribirArchivo);
            buffer.write(
                    m.getCodigo() + ","
                    + m.getDescripcion()+ ","
                    + m.getFechaIngreso()+ ","
                    + m.getFechaCaducidad()+ ","
                    + m.getPrecio()+ ","       
                    + m.getCantidad()+
                            m.getTotal()
            );
            buffer.newLine();
            buffer.close();
        } catch (Exception e) {
            return "Nose pudo guardar el registro";
        }
        return "Registro guardado correctamente";
    }

    public String modificar(prod m) {
        File arc = new File("src/archivos/alimento.txt");
        File aux = new File("src/archivos/auxalimento.txt");
        String linea = "";
        try {
            FileWriter escribirArchivo = new FileWriter(aux);
            BufferedWriter escribir = new BufferedWriter(escribirArchivo);
            FileReader leerArchivo = new FileReader(arc);
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null) {
                String[] datos = linea.split(",");
                if (Integer.parseInt(datos[0]) == m.getCodigo()) {
                    escribir.write(
                            m.getCodigo() + "," + m.getDescripcion()+ ","
                            + m.getFechaIngreso()+ "," + m.getFechaCaducidad()+ ","
                            + m.getPrecio()+ "," + m.getCantidad()+
                            m.getCantidad()+      
                        m.getTotal()

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
            return "Nose pudo modificar el registro";
        }
        arc.delete();
        aux.renameTo(arc);
        return "Registro modificado correctamente";
    }

    public String eliminar(prod m) {
        File arc = new File("src/archivos/alimento.txt");
        File aux = new File("src/archivos/auxalimento.txt");
        String linea = "";
        try {
            FileWriter escribirArchivo = new FileWriter(aux);
            BufferedWriter escribir = new BufferedWriter(escribirArchivo);
            FileReader leerArchivo = new FileReader(arc);
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null) {
                String[] datos = linea.split(",");
                if (Integer.parseInt(datos[0]) != m.getCodigo()) {
                    escribir.write(linea);
                    escribir.newLine();
                }
            }
            buffer.close();
            escribir.close();
        } catch (IOException | NumberFormatException e) {
            return "Nose pudo eliminar el registro";
        }
        arc.delete();
        aux.renameTo(arc);
        return "Registro eliminado correctamente";
    }
    
    
    public List<prod> consultar() {
        File arc = new File("src/archivos/alimento.txt");
        String linea = "";
        List<prod> listado = new ArrayList<>();
        try {
            FileReader leerArchivo = new FileReader(arc);
            BufferedReader buffer = new BufferedReader(leerArchivo);
            while ((linea = buffer.readLine()) != null) {
                String[] datos = linea.split(",");
                prod m = new prod();
                m.setCodigo(Integer.parseInt(datos[0]));
                m.setDescripcion(datos[1]);
                m.setFechaIngreso(datos[2]);
                m.setFechaCaducidad(datos[3]);
                m.setPrecio(Double.parseDouble(datos[4]));
                m.setCantidad(datos[5]);
                 double nu=m.getPrecio();
            int ac=Integer.parseInt(m.getCantidad());
           int numero=(int) (ac*nu);
                
                m.setTotal(numero);
                 
                listado.add(m);
            }
            buffer.close();
        } catch (IOException | NumberFormatException e) {
        }
        return listado;
    }
    
    public void listar(JTable tabla, List<prod> lstTrab) {
        String[] tit = new String[]{"Codigo","Descripcion", "FechaIngreso", "FechaCaducidad", "Precio", "Cantidad","Total","Existencias","Peñafiel"};
        DefaultTableModel modelo = new DefaultTableModel(null, tit);
        for (int i = 0; i < lstTrab.size(); i++) {
            Object[] objetos = new Object[7];
            objetos[0] = lstTrab.get(i).getCodigo();
            objetos[1] = lstTrab.get(i).getDescripcion();
            objetos[2] = lstTrab.get(i).getFechaIngreso();
            objetos[3] = lstTrab.get(i).getFechaCaducidad();
            objetos[4] = lstTrab.get(i).getPrecio();
            objetos[5] = lstTrab.get(i).getCantidad();
            objetos[6] = lstTrab.get(i).getTotal();   
            modelo.addRow(objetos);
        }
        tabla.setModel(modelo);
        tabla.clearSelection();
    }

    public void buscar(JTable tabla, int columna, String filtro) {
        List<prod> lstTrab = consultar();
        List<prod> t = new ArrayList<>();
        for (int i = 0; i < lstTrab.size(); i++) {
            switch (columna) {
                case 1:
                    if (lstTrab.get(i).getDescripcion().contains(filtro)) {
                        t.add(lstTrab.get(i));
                        break;
                    }
                
            }
        }
        listar(tabla, t);
    }

   
    public int codigoGenerador() {
        File arc = new File("src/archivos/alimento.txt");
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
