/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado232;

import java.util.Scanner;

/**
 *
 * @author unemi
 */
public class Empleado232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     /** //  
        Articulo p4= new Articulo ();
        
        System.out.println("nombre:"+p4.getNombre());
    
        System.out.println("cantidad: "+p4.getcantidad());
         System.out.println("precio:"+p4.getprecio());
                  System.out.println("cedula:"+p4.getCedula());

        
         //
         String s="jose";
         short e=521;
    Articulo p5= new Articulo(s,e );
    System.out.println("nombre es:" + p5.getNombre());
    System.out.println("cedula es:"+ p5.getCedula());
    //
     s="Marvos ";
    int don=25;
    Articulo p6= new Articulo(s, don);
    System.out.println("Cantidad  :"  + p6.getcantidad());
    System.out.println("nombre:"+ p6.getNombre());
    //
    s="donde";
    don=25;
    
    Articulo p9=new Articulo(s, don, don);
    System.out.println("Cantidad  :"  + p9.getcantidad());
    System.out.println("nombre:"+ p9.getNombre());
            System.out.println("Cantidad  :"  + p9.getcantidad());
            * */
       int i,suma=0, n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        n2 = sc.nextInt();
        for(i=1;i<n1;i++){  // for para sumar todos los divisores propios de n1
             if(n1%i==0){
                suma=suma+i;
             }
        }
        // si la suma de los divisores de n1 es igual a n2
        if(suma==n2){
           suma=0;
           for(i=1;i<n2;i++){  // sumo los divisores propios de n2
                if(n2%i==0){
                   suma=suma+i;
               }
           }
        // si la suma de los divisores de n2 es igual a n1
           if(suma==n1){

 
              System.out.println("Son Amigos");
           }else{
                   System.out.println("No son amigos");
           }
        }        
        else{
               System.out.println("No son amigos");
        }
    }
    
}
