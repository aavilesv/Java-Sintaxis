/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iess;

import javax.swing.JOptionPane;

/**
 *
 * @author unemi
 */
public class IESS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here el tiempo de trabajo 
       Trabajo ah= new Trabajo(); int numero=0;
        double fa=0; int numer=0;
        
   switch(numero=Integer.parseInt(JOptionPane.showInputDialog("VIENVENIDO INGRESE EL PRESTAMO A REALIZAR "+"\n"+"1. Prestamo corriente"+"\n"+"2. Prestamo especial "+"\n"+ "3. Prestamo extraordinario"+"\n")))
           {
    case 1:
    do{
        numer=Integer.parseInt(JOptionPane.showInputDialog(" ingrese sueldo"));
     
        ah.setCs(numer);
    }while(!ah.t(numer));
        ah.c(numero);
        ah.monto();
       JOptionPane.showMessageDialog(null, "EL monto es "+ah.monto());
        break;
        
    case 2:
        do{
        numer=Integer.parseInt(JOptionPane.showInputDialog(" ingrese sueldo"));
     
        ah.setCs(numer);
    }while(!ah.t(numer));
        ah.c(numero);
       JOptionPane.showMessageDialog(null, "EL monto es "+ah.monto());

        break;
    case 3:
        do{
        numer=Integer.parseInt(JOptionPane.showInputDialog(" ingrese sueldo"));
     
        ah.setCs(numer);
    }while(!ah.t(numer));
        ah.c(numero);
       JOptionPane.showMessageDialog(null, "EL monto es "+ah.monto());

        break;
    
        default:   }
    
}}
