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
public class calculo extends operacion {
    
    public calculo (int numero1, int numero2, int numero3, int numero4){
   super(numero1,numero2,numero3,numero4);
        //super (10,20,20,50); el super hay que estar ordenada mente 
    
    }
    
    public boolean  suma(){
    int s=0;
    boolean valida;
    s=getNumero1()+getNumero2()+getNumero3()+getNumero4();
    if (s==15){
    
    valida=true;
    
    } else {
       valida=false;
    }
    return valida;
    
    
    }
}
