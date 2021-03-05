/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prydeberc2fiboytriangulo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class NumerosFibonacci {
    private int indice;
    private int Fabi[];int numero=0;
private  int [][] matriz =new int[2][2];
    public NumerosFibonacci( int[] Fabi) {
        this.indice = 0;
        this.Fabi = Fabi;
    }
    public void Ingresar(){
     
        int a=0;
        int b=1;
        int suma=0;
        for (int i = 0; i <Fabi.length; i++) {
            
        
 
            a=b;
            b=suma;
            Fabi[indice]=suma;
             suma=a+b;
             indice++;
    
           
        }
    
        
        
     
    } 
   public void ind(){
       
     for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j <matriz[i].length; j++) {
               do {                   
                   numero=Integer.parseInt(JOptionPane.showInputDialog("todos"+i+":"+j));
               } while (repetido(matriz,numero));
               JOptionPane.showMessageDialog(null, numero+"["+i+"]"+"["+j+"]");                   
             matriz[i][j]=numero;
           }
       }
   
   }
   public boolean repetido(int [][] matriz,int numero){
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j <matriz[i].length; j++) {
               if(numero==matriz[i][j]){
               return true;
               }
           }
       }
       return false;}
    public String Presentaro(){String Cadena="";
        for (int i = 0; i < Fabi.length; i++) {

            Cadena+="numeroFabonacci en la posicion : "+"["+i+"]"+":"+Fabi[i]+"\n";
            
        } 
return "Datos guardardos en el arreglo"+"\n"+Cadena;}

public String Presentaroa(){
    String Cadena="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            Cadena+="numero: "+"["+i+"]"+":"+matriz[i][j]+"\n";
            
            
            }
            
            Cadena+="\n";
        } 
return "Datos guardardos en el arreglo"+"\n"+Cadena;}}

            
        
    
    
  

