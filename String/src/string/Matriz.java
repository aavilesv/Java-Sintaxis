/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;


import javax.swing.JOptionPane;

/**
 *
 */
public class Matriz {
    String [][]t;
   int  indicecolumna;
   int indicefila;
   int tamañocolumna;
   int tamañofila;
String cade;
   
    public Matriz(int i, int iq) {
       
        this.t = new String[i][iq];
         this. indicecolumna=0;
    this.indicefila=0;
    this.tamañocolumna=iq;
   this.tamañofila=i;
        
    }
public void Ingresar(){
   int numer=0;
  for (int i = 0; i < t.length; i++) {
        for (int j = 0; j < t[i].length; j++) {
           
            do{  
                
                cade=JOptionPane.showInputDialog("ingrese letra "+"["+i+"]"+"["+j+"]"+"   ").toLowerCase();
         
          }while(repetido(cade));
          t[i][j]=cade;
        }
    }

}
public boolean repetido(String casa){

for (int i = 0; i < t.length; i++) {
        for (int j = 0; j < t[i].length; j++) {
         
         if( t[i][j]==casa){
         return true;
         }
        }
    }

return false;}



    public String Presentar(){

String cadena="";
for (int i = 0; i < t.length; i++) {
        for (int j = 0; j < t[i].length; j++) {
            
            cadena+= "   "+t[i][j];
        }cadena+="\n";
    }

return cadena;
}
    
    public void Eliminar(int fila, int columna) {
        this.indicecolumna = columna;
        this.indicefila = fila;
        for (int i = indicecolumna; i < tamañocolumna; i++) {
            if (indicefila == tamañofila - 1) {
                if (i == tamañocolumna - 1) {
                    int numero=0;
                    String numer=String.valueOf(numero);
                     numer=Integer.toString(numero);
                    t[indicefila][i] = numer;
                    break;
                } else {
                    t[indicefila][i] = t[indicefila][i + 1];

                }

            } else if (i == tamañocolumna - 1) {
                t[indicefila][i] = t[indicefila + 1][0];
                indicefila = indicefila + 1;
                i = -1;

            } else {

                t[indicefila][i] = t[indicefila][i + 1];

            }
        }
    }
   
}
