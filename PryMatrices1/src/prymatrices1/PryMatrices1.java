
package prymatrices1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PryMatrices1 
{

    
    public static void main(String[] args)
    {
        
 
        
        int fil=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño de la fila"));
        int col=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño de la columna"));
        Matriz ins = new Matriz(fil,col);
        
        int n=0,dato=0,eliminar;
        do
        {  
        
        }while(ins.LlenarMatriz()==true);   
        JOptionPane.showMessageDialog(null,ins.Presentar());
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a buscar"));
        JOptionPane.showMessageDialog(null,ins.Buscar(dato));
        int fila;
        int columna;
        int numero=0; 
        JOptionPane.showMessageDialog(null,ins.modificar(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila a modificar: ")),Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna a modificar: ")),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a modificar: "))));
        JOptionPane.showMessageDialog(null,ins.Presentar());
        JOptionPane.showMessageDialog(null,ins.Eliminar(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila: ")),Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna: ")),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a reemplazar: "))));
        JOptionPane.showMessageDialog(null,ins.Presentar());
       
     }
        
}
    
    

