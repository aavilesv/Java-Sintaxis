/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayuda;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Plagu4-PC
 */
public class Control {

    public Control() {
    }

    public void bloquearControles(JPanel pnl, boolean valor) {
        for (Component obj : pnl.getComponents()) {
            if (obj instanceof JTextField || obj instanceof JTextArea) {
                ((JTextComponent) obj).setEnabled(valor);
            }
            else if (obj instanceof JButton) {
                ((JButton) obj).setEnabled(valor);
            }
            else if (obj instanceof JComboBox) {
                ((JComboBox) obj).setEnabled(valor);
            }
            else if (obj instanceof JSpinner) {
                ((JSpinner) obj).setEnabled(valor);
            }
            else if (obj instanceof JRadioButton) {
                ((JRadioButton) obj).setEnabled(valor);
            }
        }
    }

    public void habilitarBotones(JButton[] botones, boolean[] valores) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(valores[i]);

        }
    }

    public void encerarControles(JPanel pnl) {
        for (Component obj : pnl.getComponents()) {
            if (obj instanceof JTextField || obj instanceof JTextArea) {
                ((JTextComponent) obj).setText("");
            }
           
            else if (obj instanceof JSpinner) {
                ((JSpinner) obj).setValue(1);
            }
        }
    }

    public boolean validarPanel(JPanel pnl) {
        
        for (int i = pnl.getComponents().length-1; i >=0 ; i--) {
           Component obj = pnl.getComponent(i);
           if (obj instanceof JTextField || obj instanceof JTextArea) {
                if (((JTextComponent) obj).getText().equals("")) {
                    ((JTextComponent) obj).requestFocus();
                    return false;
                }
            }
            else if (obj instanceof JComboBox) {
                if (((JComboBox) obj).getSelectedIndex() == 0) {
                    ((JComboBox) obj).requestFocus();
                    return false;
                }
            } 
        }
        return true;
    }
}
