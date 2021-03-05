/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryimpuesto2c2;

import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class Impuesto_verde {
    private int cilibraje;
    private double ImpuestoVerde;
   private double fa;
private double t;

    public int getCilibraje() {
        return cilibraje;
    }

    public double getFa() {
        return fa;
    }

    public double getT() {
        return t;
    }
    public int Cilibraje(int cilindra){
        this.cilibraje=cilindra;
        cilibraje=cilibraje-1500;
        return cilibraje;}
    public double ImpuestoCal(){
        ImpuestoVerde=(int) ((cilibraje)*t*(1+fa));
        return ImpuestoVerde;}
    
    public boolean T(int numero){
        boolean a= true;
        int nue=0;
    this.cilibraje=numero;
cilibraje=cilibraje-1500;
 if(cilibraje<=1500){
 nue=1;} 
    if(cilibraje>=1501&& cilibraje<=2000){
    nue=2;}
    if(cilibraje<=2500&&cilibraje>=2001){
    nue=3;}
    if(cilibraje<=3000&& cilibraje>=2501){
   nue=4;}
   if(cilibraje<=3500&& cilibraje>=3001){
 nue=5;
       } 
switch(nue){
    case 1:
      t=0.0;
        break;   
    case 2:
       t=0.08;
      
        break;
    case 3:
       t=0.09;
        break;
    case 4:
       
       t=0.11;
        break;
    case 5:
      
       t=0.12; 
        break;
        default:
            a=false;
            return a;
}
     return true;}
    
public boolean  antiguedad(int numero ){
    boolean o=true;
switch(numero){
    case 1:
        fa=0.0;
        break;
        
    case 2:
       fa=0.05;
      
        break;
    case 3:
       fa=0.1;
        break;
    case 4:
      
       fa=0.15;
        break;
        default:    
            JOptionPane.showMessageDialog(null, " Error en el rango de la antiguedad ");

           o=false;
           return o;
  
}
    return true;}
}
