/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooguiado2;

import java.util.Scanner;

/**
 *
 * @author GOYO
 */
public class Pooguiado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculo12 po=new calculo12();
        Scanner va= new Scanner (System.in);
        int numero1=0;
        int numero2=0;
       
        // ejercicio 1 
        try {
             
       while(numero1<1){
           System.out.println("ingrese numero 1 "); 
           numero1=va.nextInt();
        
       }
        }catch(Exception e){
       
        System.out.println("no me diste un valor numerico ");
        }
        finally {
            System.out.println("proceso terminado  ");
        }
        try{
            do{
            System.out.println("Ingrese Numero 2");
            numero2 = va.nextInt();
        }while((numero2-numero1)!=3 && (numero2-numero1)!=-3 );
            
        
        
            
        }catch(Exception e ){
          System.out.println("no me diste un valor numerico ");
        }
        finally {
        System.out.println("terminado ");
        }
     po.setNumero1(numero1);
        po.setNumero2(numero2);
        
        
           
        if(po.getNumero1()<po.getNumero2()){
            po.setNumero1(numero2);
            po.setNumero2(numero1);
        }
        
        
        System.out.println("Rando  "+po.getNumero1()+" y "+po.getNumero2()+" es: "+po.presentarRango(po.getNumero1(), po.getNumero2()));
     
    // ejercicio 2 
        String rango;
        rango= po.presentarRango(po.getNumero1(), po.getNumero2());
        po.primosImpares(rango);
        if(po.primosImpares(rango).equals(""))
        {
            System.out.println("no tenemos numeros primos ");
        }
        else{
            System.out.println("Los numeros primos son: "+po.primosImpares(rango));
        
    
      }
        //ejercicio 3
           System.out.println("Ingrese la palabra a invertir");
       Scanner pal1= new Scanner(System.in);
       
           String pala = pal1.nextLine();
        po.palabrainversa(pala);
        if(po.palabrainversa(pala)==false){
            System.out.println(" la palabra ingresada  no es valida  palindroma");
        }else{
            System.out.println("La palabra  es palindroma");
        }          
                      
                      }

           


}