/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprychar;

import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class Aprychar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
metedo an= new metedo(5, 5);
an.ingresar();
        JOptionPane.showMessageDialog(null, an.Presentar());
JOptionPane.showMessageDialog(null, an.Vocale());
    }
    
}
