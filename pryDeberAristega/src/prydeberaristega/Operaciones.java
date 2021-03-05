/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prydeberaristega;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Aristega
 */
public class Operaciones {
    private int n1;
    private int n2;
    public Operaciones(){
        
    }
    public Operaciones(int n){
        int Operaciones;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

public void numeroPrimo (){
   int contador=0;
for(int a=1; a<=n1;a++){
if(n1%a==0){
contador++;
}

}
if(contador==2){
JOptionPane.showMessageDialog(null, "numero primo ");
       
}else{
    JOptionPane.showMessageDialog(null, "numero no es primo ");

}
    }
    public void numeroperfecto (){
   int contador=0;
for(int a=1; a<n1;a++){
if(n1%a==0){
contador+=a;
  System.out.println(contador);
}

}
if(contador==n1){
JOptionPane.showMessageDialog(null, "numero perfecto ");
       
}else{
    JOptionPane.showMessageDialog(null, "numero no es perfecto ");

}
    }
    public int suma(int n1,int n2){
        
       
       int suma=n1;
       int sum= suma+n2;
        return sum;
    }
    
    public void fibonaci(){
          int a=0;
        int b=1;
        int suma=0;
        int cont=1;
        
        int num =  this.n1;
          System.out.println("\n0"+"\n1");

        while(cont<=10){
            suma=a+b;
           
            
                        System.out.println(suma);

            a=b;
            b=suma;
            
            suma++;
            cont++;
        }


    
    }
    
}

     
        
        
    

