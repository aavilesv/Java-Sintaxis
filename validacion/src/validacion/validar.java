/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

/**
 *
 * @author unemi
 */
public class validar {
    int numero;
    String nombre;
    
    public int validar(String pa)
    {
        char caracter;
        int contador =0;
        for(int i=0; i<pa.length();i++)
        {
           caracter=pa.charAt(i);
           if(Character.isLetter(caracter)){
               
           }else
           {
               contador=contador+1;
               
           }
        }
        return contador;
    }
    public int Validarn (String num)
    { 
        char caracter;
        int contador =0;
        for(int i=0; i<num.length();i++)
        {
           caracter=num.charAt(i);
           if(Character.isDigit(caracter)){
               
           }else
           {
               contador=contador+1;
               
           }
        }
        return contador;
        
    }
    public boolean validarp (String palabra)
    {
        //boolean para que retorne un valor verdadero o falso
        boolean vali=true;
        char caracter2;
        for(int i=0; i<palabra.length();i++)
        {
           caracter2=palabra.charAt(i);
           if(Character.isLetter(caracter2)){
               
           }else
           {
              vali=false;
             
           }
        }
        return vali;
    }
}
