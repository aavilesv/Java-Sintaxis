/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prydeberc2fiboytriangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class EltrianguloPascual {

    private int indice;
    private int Tri[];

    public EltrianguloPascual(int[] Tri) {
        this.indice = 0;
        this.Tri = Tri;
    }

    public String Ingresar() {
         JOptionPane.showMessageDialog(null, " Solo esta hasta el numero 10 en el triangulo de pascal");

        String Cadena = ""; String Cade="  ";int w=0;int we=0;
        int nu = 0;
        int p = 0;
        int numero = 0;
        int t = 1;

        Tri[indice] = t; int ayuda=0;
        for (int i = 0; i < Tri.length; i++) {
            if (i < Tri.length) {
                numero = p + t;   }
            if(i==1){     
            Tri[i] = numero;
            Cadena += Cade+Cade+ Cade+Cade+Cade+Cade+Cade+Cade+p+Cade+Tri[i]+Cade+p+"\n"; }
            if(i==0){
                Tri[i] = numero;  Cadena +=Cade+Cade+Cade+ Cade+Cade+Cade+Cade+Cade+Cade+Cade+Tri[i]+Cade+"\n";} 
            if(i==2){Tri[i] = numero;
            Cadena += Cade+Cade+ Cade+Cade+Cade+Cade+Cade+t+Cade+Tri[i]+Cade+Tri[i]+Cade+t+"\n";
            }
            if(i==3){
                Tri[i] = numero;
               ayuda=Tri[i]+Tri[i]-2;
            Cadena += Cade+Cade+ Cade+Cade+Cade+Cade+t+Cade+Tri[i]+Cade+ayuda+Cade+Tri[i]+Cade+t+"\n";}
            if(i==4){
             Tri[i] = numero;
               ayuda=Tri[i]+Tri[i];
            Cadena += Cade+ Cade+Cade+Cade+Cade+t+Cade+Tri[i]+Cade+ayuda+Cade+ayuda+Cade+Tri[i]+Cade+t+"\n";}

            if(i==5){
             Tri[i] = numero;
             nu=ayuda+ayuda;
               ayuda=Tri[i]+Tri[i]+3;
            Cadena += Cade+ Cade+Cade+Cade+t+Cade+Tri[i]+Cade+ayuda+Cade+nu+Cade+ayuda+Cade+Tri[i]+Cade+t+"\n";}
            if(i==6){
             Tri[i] = numero;
             nu=ayuda+ayuda+5;
               ayuda=Tri[i]+Tri[i]+7;
            Cadena += Cade+Cade+Cade+t+Cade+Tri[i]+Cade+ayuda+Cade+nu+Cade+nu+Cade+ayuda+Cade+Tri[i]+Cade+t+"\n";}
              if(i==7){
             Tri[i] = numero;
             w=nu+nu;
             nu=ayuda+ayuda+14;
               ayuda=Tri[i]+Tri[i]+12;
            Cadena += Cade+Cade+t+Cade+Tri[i]+Cade+ayuda+Cade+nu+Cade+w+Cade+nu+Cade+ayuda+Cade+Tri[i]+Cade+t+"\n";}
               if(i==8){
             Tri[i] = numero;
             w=nu+nu+14;
             nu=ayuda+ayuda+28;
               ayuda=Tri[i]+Tri[i]+18;
            Cadena += Cade+t+Cade+Tri[i]+Cade+ayuda+Cade+nu+Cade+w+Cade+w+Cade+nu+Cade+ayuda+Cade+Tri[i]+Cade+t+"\n";}
              if(i==9){
             Tri[i] = numero;
             we=w+w;
             w=nu+nu+42;
             nu=ayuda+ayuda+48;
               ayuda=Tri[i]+Tri[i]+25;
            Cadena +=t+Cade+Tri[i]+Cade+ayuda+Cade+nu+Cade+w+Cade+we+Cade+w+Cade+nu+Cade+ayuda+Cade+Tri[i]+Cade+t+"\n";}
              p++;

        }
        return "Triangulo de pascal"+"\n"+" Creacion de la piramide"+"\n"+Cadena;
    }

  


}
