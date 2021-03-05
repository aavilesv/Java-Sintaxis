/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class NewMainasdasd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Matriz es=new Matriz(6, 4);
es.Ingresar();
JOptionPane.showMessageDialog(null, es.Presentar());
es.Eliminar(1, 2);
JOptionPane.showMessageDialog(null, es.Presentar());

  // TODO code application logic here
    }
    
}
