/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prydeberaristega;

/**
 *
 * @author Aristega
 */
public class Validacion {
     public boolean validarnumero(String numero, String nume){
        
    for(int i = 0; i<numero.length(); i++){
     if( !Character.isDigit(numero.charAt(i)) ){

         return false;
          
     }
    }
     
     for(int in = 0; in<nume.length(); in++){
     if( !Character.isDigit(numero.charAt(in)) ){

         return false;
          
     }
 }
 return true;

    
}
}


