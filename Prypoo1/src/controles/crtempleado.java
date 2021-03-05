
package controles;
import dao.daoempleado;
import java.util.List;
import javax.swing.JTable;
import modelo.emp;
public class crtempleado {

    public crtempleado() {
    }
    public int codigoGenerador(){
        daoempleado dao = new daoempleado();
        return dao.codigoGenerador();
    }
    
    public String crear(emp v){
     daoempleado dao = new daoempleado();
        return dao.crear(v);
    }
    
    public String modificar(emp v){
        daoempleado dao = new daoempleado();
        return dao.modificar(v);
    }
    
    public String eliminar(emp v){
       daoempleado dao = new daoempleado();
        return dao.eliminar(v);
    }
   
    public List<emp> consultar(){
      daoempleado dao = new daoempleado();
        return dao.consultar();
    } 
    
    public void buscar(JTable tabla,int columna, String filtro){
        daoempleado dao = new daoempleado();
        dao.buscar(tabla, columna, filtro);
    }
    
    public void listar(JTable tabla,List<emp> lstTrab){
       daoempleado dao = new daoempleado();
        dao.listar(tabla, lstTrab);
    }
}
