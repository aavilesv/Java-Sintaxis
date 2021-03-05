/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayuda;

import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Plagu4-PC
 */
public class Validacion {

    public Validacion() {
        
    }
   
    public void validarCajas(KeyEvent e, int opcion) {
        char c = e.getKeyChar();//Obtener KeyChar de texto clave


        switch (opcion) {
            case (1):
                if (!Character.isDigit(c)) {
                    e.consume();
                }
                break;
            case (2):
                if (!Character.isLetter(c) & !Character.isSpaceChar(c)) {
                    e.consume();
                }
                break;
            case (3):
                if (!Character.isLetterOrDigit(c)) {
                    e.consume();
                }
                break;
        }
    }

    public void siguiente(Component obj, KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)//  haci esto sirve para 
        {
            if (obj instanceof JTextField || obj instanceof JTextArea) {
                ((JTextComponent) obj).requestFocus();
            }
            else if (obj instanceof JButton) // esto sirve para
            {
                ((JButton) obj).requestFocus();
            }
            else if (obj instanceof JComboBox) // esto sirve para 
            {
                ((JComboBox) obj).requestFocus();
            }
            else if (obj instanceof JSpinner) {
                ((JSpinner) obj).requestFocus();
            }
            else if (obj instanceof JRadioButton) {
                ((JRadioButton) obj).requestFocus();
            }
        }
    }
}
