/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author unemi
 */
public class operacion {
   protected int numero1;
   protected int numero2;
   protected int numero3;
   protected int numero4;
   
   //tengo que hacer un para parametros 
   public operacion(){
   
   }
  
    public operacion(int numero1, int numero2, int numero3, int numero4) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.numero4 = numero4;
    }

public void setNumero1(int numero){
this.numero1=numero;
}

   public int getNumero1(){
   
   return numero1;
   }
public void setNumero2(int numero2){

this.numero2=numero2;
}
    public int getNumero2(){
    
    return numero2;
    
    } public void setNumero(int numero3){
    
    this.numero3=numero3;
    
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public void setNumero4(int numero4) {
        this.numero4 = numero4;
    }

    public int getNumero3() {
        return numero3;
    }

    public int getNumero4() {
        return numero4;
    }
    
public String  datos (){

    String cadena;
    cadena=numero1+","+numero2+numero3+numero4;
    
    
return cadena;

}
// tiString solo devuelve datos ordenados 
    @Override
    public String toString() {
        return "operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", numero3=" + numero3 + ", numero4=" + numero4 + '}';
    }

}
