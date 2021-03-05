/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryayudantias;

import javax.swing.JOptionPane;

/**
 *
 * @author unemi
 */
public class Pryayudantias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Matriz ange;
        int tf, tc;
        
   
    
     tf=Integer.parseInt(JOptionPane.showInputDialog("ingrese fila"));
  
        tc=Integer.parseInt(JOptionPane.showInputDialog("ingrese columna"));

ange =new Matriz(tf,tc);
    Boolean no;
    do{
            int c=Integer.parseInt(JOptionPane.showInputDialog("ingrese cualquier valor"));
          no=ange.llenarmatriz(c);
    
    }while(no);
    JOptionPane.showMessageDialog(null, ange.presentar());
        boolean n;
    
    
    do{
            
        int valor=Integer.parseInt(JOptionPane.showInputDialog("ingrese cualquier valor"));
    n=ange.buscar(valor);
    }while(!n);
    ange.elimnar();
    
    JOptionPane.showMessageDialog(null, ange.presentar());

}
}
