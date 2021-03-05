
package controlador;
import dao.daoproducto;
import java.util.List;
import javax.swing.JTable;
import modelo.prod;
public class crtproducto {

    public crtproducto() {
    }
    public int codigoGenerador(){
        daoproducto dao = new daoproducto();
        return dao.codigoGenerador();
    }
    
    public String crear(prod m){
         daoproducto dao = new daoproducto();
        return dao.crear(m);
    }
    
    public String modificar(prod m){
       daoproducto dao = new daoproducto();
        return dao.modificar(m);
    }
    
    public String eliminar(prod m){
        daoproducto dao = new daoproducto();
        return dao.eliminar(m);
    }
   
    public List<prod> consultar(){
    
        daoproducto dao = new daoproducto();
        return dao.consultar();
    
    } 
    
    public void buscar(JTable tabla,int columna, String filtro){
       daoproducto dao = new daoproducto();
        dao.buscar(tabla, columna, filtro);
        
    }
    
    public void listar(JTable tabla,List<prod> lstTrab){
        daoproducto dao = new daoproducto();
        dao.listar(tabla, lstTrab);
    }
}
