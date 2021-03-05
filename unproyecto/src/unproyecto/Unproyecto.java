/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unproyecto;

import java.util.Scanner;
import modelo.calculo;
import modelo.operacion;

/**
 *
 * @author unemi
 */
public class Unproyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int n1, n2,n3;
int n4;
Scanner leer=new Scanner(System.in);
        System.out.println("ingrese numero1");
        
        n1=leer.nextInt();
        System.out.println("ingrese numero2");
        n2=leer.nextInt();
        System.out.println("ingrese numero3");
        n3=leer.nextInt();
        System.out.println("ingrese numero4");
        n4=leer.nextInt();
    calculo  op=new calculo(n1,n2,n3,n4);
   
     System.out.println("suma total");
        System.out.println(op.suma());
        
        if(op.suma()){
        
            System.out.println("los valores ingresados han sumado 150");
            
        }else {
            System.out.println("los valores no han sumado 150");}
    }
    
}
