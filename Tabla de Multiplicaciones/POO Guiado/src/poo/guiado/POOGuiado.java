/**     int num=45;
        String str=String.valueOf(num);
        String rpta="";
        char[]valor=str.toCharArray();
        for (int i=valor.length-1; i>-1;i--){
        rpta+=valor[i]+"";
        }
        System.out.println(rpta);     
         */ 
package poo.guiado;

import java.util.Scanner;

public class POOGuiado {

    public static void main(String[] args) {       
   // numero invertido 
        Scanner numero = new Scanner(System.in);   
        System.out.println("INGRESAR NUMERO: ");    
        CalculoMatematico calculo = new CalculoMatematico();       
        int nume = numero.nextInt();     
        System.out.println("el numero invertido es : "+ calculo.numeroInvertido(nume));
        
        // numero perfecto 
        
        System.out.println("ingrese numero:");
        nume = numero.nextInt(); 
        CalculoMatematico calcul= new CalculoMatematico();
       
        System.out.println("el numero perfecto es :" + calcul.numeroPerfecto(nume)) ;
        
        // numero primo impar
        
        CalculoMatematico numPrimo = new CalculoMatematico();
       System.out.println("ES NUMERO PRIMO? " +numPrimo.numeroPrimoImpar(nume));
   
             
       
            
}
}
