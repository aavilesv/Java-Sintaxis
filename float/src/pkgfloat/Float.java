/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfloat;

import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class Float {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int numero=3;
String numer="";
numer=Integer.toString(numero);
        System.out.println(numer);

        registro as=new registro(3, 5);
        do{
       numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"+as.getIndicefila()));
           
         
        
        }while(   as.ingresar(numero)==true);
       JOptionPane.showMessageDialog(null, as.presentar());
    }
    
}
