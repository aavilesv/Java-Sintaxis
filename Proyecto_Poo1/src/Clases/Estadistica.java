/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author ORTIZ
 */
public  class Estadistica {
    private int numero;
    private int contador;

    public Estadistica() {
    }

    public Estadistica(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getContador() {
        return contador;
    }

    
    
    //añadir un conjunto de datos
    //agrga los numeros
    public void addValueitem() {
     
     
    }
  //el numero de intem agregados
    public  int getCount() {
        this.contador++;
        
    return contador;    
    }
//suma
  

//desviacion estandar 
    public   void getStandardDeviation(){
        
    }


    
    
    
    
    
}
