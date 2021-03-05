/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priyoperaciones.pkg1;

/**
 *
 * @author unemi
 */
public class Calculadora {
   // Atributos 
    
    private int numero1;
        private int numero2;
                int  resultado; //variable global 
        //Metodos 
        public void suma (int numero1 , int numero2)
        {
            
         int res= numero1 + numero2;
         System.out.println("la suma es: " + res);
        }
    public int suma1(int numero1 , int numero2 )
    {
        return numero1+ numero2;
    
    }
    public void resta (int numero1 , int numero2)
    {
        int res=numero1- numero2;
               
        System.out.println(" la resta es :"  + res );
        
    }
    public int multiplicacion (int numero1 , int  numero2){
    return numero1 * numero2;
    }
    
    public  void davisiion ()
            
    { numero1=10;
    numero2=5;
        int res=numero1 / numero2;
    System.out.println(" la division es " +res);
  
    }
}
