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
public class vector {
    int vector1[];
    int vector2[],vector3[];
    int matriz[][],matriz1[][];
    int indice1,tamanofila,tamaño1columna;
    int indice2,indicefila,indicecolumna;
   public vector(int tamaño,int columna){
   this.vector1=new int [tamaño];
   this.vector2=new int [tamaño];
   this.tamanofila=tamaño;
   this.tamaño1columna=columna;
  this.vector3=new int [tamaño];
          this.matriz=new int[tamaño][columna];
          this.matriz1=new int[tamaño][columna];
         this.indice1=0;
         this.indicecolumna=0;
         this.indicefila=0;
   }
   public void Matrizingresar(){
         int numero=0;
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
         do{  
             numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese matriz A:"+"["+i+"]"+"["+j+"]"));
         }while(numerorepetido(numero));
         matriz[i][j]=numero;}
       }
}
          public boolean numerorepetido(int numero){
              
              
              for (int i = 0; i <matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if(numero==matriz[i][j]){
                     
                 JOptionPane.showMessageDialog(null,"numero repetido en posicion:"+"["+i+"]"+"["+j+"]");
                        return true;
                    }
                    
               }
            }
              return false;}

   public void buscar(int numero){
            for (int i = 0; i <matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if(numero==matriz[i][j]){
                    indicefila=i;
                    indicecolumna=j;}
                }
            }
}
//eliminar desdes una matriz
   public void matrizeliminar(){
       for (int i = indicefila; i < matriz.length; i++) {
           for (int j = indicecolumna; j < matriz[i].length; j++) {
               if(j==matriz[i].length-1){
               if(i==matriz.length-1){
               matriz[i][j]=0;
               
               }else{ 
                   indicecolumna=0;
                   matriz[i][j]=matriz[indicefila+1][indicecolumna];
               indicefila++;}
               }else{
             matriz[i][j]=matriz[indicefila][indicecolumna+1];
               indicecolumna++;
               }
           }
       }
   
   }
   public String MAtrizPresentar(){
      String cadenamatriz=""; for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               cadenamatriz+="    "+"["+i+"]"+"["+j+"]"+matriz[i][j];
           }cadenamatriz+="\n";
       }
   
   return cadenamatriz;
   }
   //pues para hacer la inversa de una matriztengo que hacer ora matriz para que no se borre la informacion
   public String inversamatriz(){
   String cadena="";
       for (int i = 0; i < tamanofila; i++) {cadena+="\n";
           for (int j = 0; j <tamaño1columna; j++) {
                
             matriz1[i][j]=  matriz[tamanofila-1-i][tamaño1columna-1-j];
               
               cadena+= "   "+matriz1[i][j];
           }
       }
   return cadena;}
   public void Ingresar(){
   
       for (int i = 0; i < vector1.length; i++) {
           int numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese vector A:"+i));
           vector1[i]=numero;
       }for (int i = 0; i < vector2.length; i++) {
           int numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese vector B  :"+i));
                vector2[i]=numero1;
  }}//eliminar un numero y ponerlo hasta atras vector
      public void eliminar(int numero){
          for (int i = 0; i < vector2.length; i++) {
              if(numero==vector2[i]){
              vector2[i]=0;
              indice1=i;
              }
              
          }
          for (int i = indice1; i < vector2.length; i++) {
             
              if(i==vector2.length-1){
              vector2[i]=0;
              }else {vector2[i]=vector2[i+1];
              }
          }
      
      }
   public String presentar(){
   String cadena="",cadena1="",cadena2="";
            for (int i = 0; i < vector1.length; i++) {
                cadena+="   "+ vector1[i];
                cadena1+="   "+vector2[i];
            }
   return cadena+"\n"+cadena1;}
   //esta la forma inversa de un vector
   public String sumainversa(){   
       String cadena="",cadena1="",cadena2="";

       for (int i = 0; i < vector3.length; i++) {
           vector3[i]=vector1[vector1.length-1-i]+vector2[i];
      cadena2+="   "+vector3[i];   }
   
  return cadena2; }
}
