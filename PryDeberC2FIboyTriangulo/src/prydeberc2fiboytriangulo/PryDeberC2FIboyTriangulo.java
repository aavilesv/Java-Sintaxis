/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prydeberc2fiboytriangulo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 */
public class PryDeberC2FIboyTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[];
        Scanner con=new Scanner (System.in);
EltrianguloPascual ange=new EltrianguloPascual(new int [10]);  
NumerosFibonacci angew=new NumerosFibonacci(new int [20]);  
angew.ind();
//angew.Ingresar();

         JOptionPane.showMessageDialog(null, angew.Presentaroa());

// JOptionPane.showMessageDialog(null, ange.Ingresar());
 //   ange.piramide();
    
       
    }
    }

