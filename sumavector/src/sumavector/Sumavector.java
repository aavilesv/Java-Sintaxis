/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumavector;

import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class Sumavector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
vector ange=new vector(12,10);

ange.Matrizingresar();

        JOptionPane.showMessageDialog(null, ange.MAtrizPresentar());
        JOptionPane.showMessageDialog(null, ange.inversamatriz());
        ange.buscar(20);
        ange.matrizeliminar();
        JOptionPane.showMessageDialog(null, ange.MAtrizPresentar());
        ange.Ingresar();
        ange.eliminar(19);
                JOptionPane.showMessageDialog(null, ange.presentar());

        JOptionPane.showMessageDialog(null, ange.sumainversa());

    }
    
}
