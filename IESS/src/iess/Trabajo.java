/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iess;

import javax.swing.JOptionPane;

/**
 *
 * @author unemi
 */
public class Trabajo {
    private int monto ;
    private double cp;
    double Cs=0;

    public int getMonto() {
        return monto;
    }

    public double getCs() {
        return Cs;
    }

    public int getNumerodeimposiciones() {
        return numerodeimposiciones;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setCs(double Cs) {
        this.Cs = Cs;
    }

    public void setNumerodeimposiciones(int numerodeimposiciones) {
        this.numerodeimposiciones = numerodeimposiciones;
    }
    private int numerodeimposiciones;

    public double getCp() {
        return cp;
    }

    public void setCp(double cp) {
        this.cp = cp;
    }
   
    public double c(int numero){
       switch(numero){
           
    case 1:
        cp=1.1;
        break;
        
    case 2:
cp=1.5;
        break;
    case 3:
        cp=2;

        break;}
          JOptionPane.showMessageDialog(null, "1. Prestamo corriente       1.1"+"\n"+"2. Prestamo especial    1.5 "+"\n"+ "3. Prestamo extraordinario      2"+"\n");
        return cp;
  };
    public int monto(){
        int  numer=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese Meses que alla trabajado"));
        monto=(int) ((int)(numer-10)*(Cs*cp));
        return monto;}
        public boolean t(int numero){ boolean a= true;
        int nue=0;
  
 if(numero<=500&& numero>=360){
        Cs=2.5; 
 nue=1;} 
    if(numero>=501&& numero<=800){
       Cs=4.5;
    nue=2;}
    if(numero<=1000&&numero>=801){
       Cs=5;nue=3;}
    if(numero<=1500&& numero>=1001){
     Cs=5.5;nue=4;}
   if(numero<=2000&& numero>=1501){
   Cs=6;
       nue=5;
       } 
switch(nue){
    case 1:
      Cs=2.5;
        break;   
    case 2:
       Cs=4.5;
      
        break;
    case 3:
       Cs=5;
        break;
    case 4:
       
       Cs=5.5;
        break;
    case 5:
      
       Cs=6; 
        break;
        default:
            a=false;
            return a;
            
}
JOptionPane.showMessageDialog(null, " ingresado Sueldo es"+Cs+"\n"+"Nª Tipo servidor rango-sueldo categoria de salario   "+"\n"+"1. Sp1 360 - 500         2.5"+"\n"+"2. 501-800        4.5"+"\n"+"3.  801-1000        5"+"\n"+"4. 1001-1500        5.5"+"\n"+"5.  1501-2000         6");
     return true;}
  public void a (int numero){ 
      switch(numero){
    case 1:
       
        break;
        
    case 2:
     
        break;
    case 3:
       
        break;
    case 4:
      
      
        break;
        default:  
            break;
}}}
