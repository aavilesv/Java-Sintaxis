/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author unemi
 */
public class Validacion {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Scanner scan=new Scanner (System.in);
     String palabra;
     System.out.println("ingrese una palabra:");
     palabra=scan.nextLine();
    validar va =new validar();
    //instanciar clase
    
     
    if( va.validar(palabra)==0)
    {
        System.out.println("tu as ingresado una palabra: " + palabra );
    }else
    {
        System.out.println(" lo ingresado no es una palabra: "+ palabra);
    }
    Scanner num=new Scanner (System.in);
    String numero;
    System.out.println("ingrese un numero");
    numero=num.nextLine();
    
    if( va.Validarn(numero)==0)
    {
        System.out.println("tu as ingresado un numero: " + numero );
    }else
    {
        System.out.println(" lo ingresado no es un numero: "+ numero);
    }
   
    if (va.validarp(palabra))
    {
        System.out.println("tu as ingresado una palabra: " + palabra );
    }
    else
    {
        System.out.println(" lo ingresado no es una palabra: "+ palabra);
    }
    operacion op;
    op=new operacion();
    op.setNumero1(10);
    op.setNumero2(4);
    
    System.out.println(op.suma(op.getNumero1(),op.getNumero2()));
    
 
}
    
}
