
package controles;
import dao.daocliente;
import java.util.List;
import javax.swing.JTable;
import modelo.cliente;
import modelo.prod;
public class crtcliente {

    public crtcliente() {
    }
    public int codigoGenerador(){
        daocliente dao = new daocliente();
        return dao.codigoGenerador();
    }
    
    public String crear(cliente d){
        daocliente dao = new daocliente();
        return dao.crear(d);
    }
    
    public String modificar(cliente d){
        daocliente dao = new daocliente();
        return dao.modificar(d);
    }
    
    public String eliminar(cliente d){
        daocliente dao = new daocliente();
        return dao.eliminar(d);
    }
   
    public List<cliente> consultar(){
        daocliente dao = new daocliente();
        return dao.consultar();
    } 
    
    public void buscar(JTable tabla,int columna, String filtro){
        daocliente dao = new daocliente();
        dao.buscar(tabla, columna, filtro);
    }
    
    public void listar(JTable tabla,List<cliente> lstTrab){
        daocliente dao = new daocliente();
        dao.listar(tabla, lstTrab);
    }

    public Object eliminar(prod d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
