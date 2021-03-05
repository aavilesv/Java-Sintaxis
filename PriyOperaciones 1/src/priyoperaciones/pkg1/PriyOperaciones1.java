/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priyoperaciones.pkg1;

import java.util.Scanner;

/**
 *
 * @author unemi
 */
public class PriyOperaciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Instanciar la clase  clase 
        Calculadora cal= new Calculadora();
       Scanner num= new Scanner(System.in);
       System.out.println("ingrrse valor1:");
       int num1=num.nextInt();
       System.out.println("ingrese valor2:");
       int num2=num.nextInt();
       // llamar a un metodo que no retorna valor pero si recibe parametro 
       cal.suma(num1, num2);// Envio como parametros los valores ingresados 
       //llamar a un metodo que retorna valor y recibe parametro 
       System.out.println("la suma es:" + cal.suma1(num1, num2));
        
        int res=cal.suma1(num1, num2);
        System.out.println("la suema es "+ res);
        
 
        // llamar a un metodo  que no retorna valor pero si tiene parametro 
        cal.resta(num1, num2);// envio como parametros los  valores ingresados 
        System.out.println("  la multiplicacion :" + cal.multiplicacion(num1, num2));
        cal.davisiion();
        
      
    }
    
}
