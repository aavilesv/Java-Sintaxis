/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abelimin;

/**
 *
 * @author GOYO
 */
public class Class {
    public String ingresar(String cade)
    {    String cade1="";

        for (int i = 0; i < cade.length(); i++) {
         
            cade1+="  "+cade.charAt(cade.length()-1-i);
       
        }
        
    
    return cade1;}
}
