/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprychar;

import javax.swing.JOptionPane;

/**
 
 */
public class metedo {
    int indicefila;
       int indicecolumna;
    int tamañofila;
    int tamañocolumna;
char  letra[][];
char arreglo[];
public metedo(int numero , int columna){
this.letra=new char [numero][columna];
indicecolumna=0;
indicecolumna=0;
tamañocolumna=columna;
tamañofila=numero;
this.arreglo=new char [columna];
}

public void ingresar(){
    char cade;
    for (int i = 0; i < letra.length; i++) {
        for (int j = 0; j < letra[i].length; j++) {
          do{  
           
              cade=(JOptionPane.showInputDialog("ingrese letra "+"["+i+"]"+"["+j+"]"+"   ").charAt(0));
          }while(letraRepitida(cade));
          letra[i][j]=cade;
        }
    }

}

public boolean letraRepitida(char cade){
      for (int i = 0; i < letra.length; i++) {
        for (int j = 0; j < letra[i].length; j++) {
            if (letra[i][j]==cade){
      return true;
            }}
    }
    
    
    return false;}
public String Vocale(){
    int contador=0;
    for (int i = 0; i < letra.length; i++) {
        for (int j = 0; j < letra[i].length; j++) {
           if(letra[i][j]=='a'||letra[i][j]=='e'||letra[i][j]=='i' ||letra[i][j]=='o'||letra[i][j]=='u'){
           contador++;
           }
        }
    }
    
    return "el numero de vocales es "+contador;}
public String Presentar(){

String cadena="";
for (int i = 0; i < letra.length; i++) {
        for (int j = 0; j < letra[i].length; j++) {
            
            cadena+= "   "+letra[i][j];
        }cadena+="\n";
    }

return cadena;
}
}
