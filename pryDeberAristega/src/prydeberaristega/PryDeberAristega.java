/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prydeberaristega;

import java.util.Scanner;
        import javax.swing.JOptionPane;


/**
 *
 * @author Aristega
 */
public class PryDeberAristega {

    /**
º     */
    public static void main(String[] args) {
    int bandera=1;
        Operaciones op =new Operaciones();
         int opciones = 0;
      int tamano =0;
       int segundo=0;
       do{
        opciones = Integer.parseInt(JOptionPane.showInputDialog("MENU \n \"1.	Ingresar Valor\\n\" +\n" +
"\"2.	Suma\\n\" +\n" +
"\"3.	Número Primo\\n\" +\n" +
"\"4.	Serie Fibonacci\\n\" +\n" +
"\"5.	Número Perfecto\\n\" +\n" +
"\"6.	Convertir decimal a binario\\n\" +\n" +
"\"7.	Salir\""));
       
        switch (opciones) {
            case 1:
                 tamano = Integer.parseInt(JOptionPane.showInputDialog("_Ingrese un valor"));
                op.setN1(tamano);
                bandera=2;
                break;
            case 2:
                
                tamano = Integer.parseInt(JOptionPane.showInputDialog("_Ingrese un valor 1 "));
                 segundo = Integer.parseInt(JOptionPane.showInputDialog("_Ingrese un valor 2 "));
            JOptionPane.showMessageDialog(null, op.suma(tamano, segundo));
             ;break;
            case 3:
                if(bandera==2){
                    op.numeroPrimo();
                }else{JOptionPane.showMessageDialog(null, "ingrese valor primero ");}
             
                break;
            case 4:
                if(bandera==2){
              op.fibonaci();
                }else{JOptionPane.showMessageDialog(null, "ingrese valor primero ");}
            
          
            break;
            case 5:
            if(bandera==2){
             op.numeroperfecto();
                }else{JOptionPane.showMessageDialog(null, "ingrese valor primero ");}
            
                break;
            case 6:
            if(bandera==2){
            
                }else{JOptionPane.showMessageDialog(null, "ingrese valor primero ");}
            
            break;

        }
        }while(opciones!=7);
      
      }  
      
//                     
//          }
//        System.out.println("INGRESE UN NUMERO:");
//        String nun=sc.nextLine();
//        
//        if(val.validarnumero(num,nun)){
//             n=Integer.parseInt(num);
//             nu=Integer.parseInt(nun);
//         
//             
//             
//             
//             op.suma(n,nu);
//             if(nu>0){
//                 System.out.println("la suma es " +op.suma(n,nu));   
//             }
//        boolean b=op.NumeroPrimo();
//        if (b == true) {
//            System.out.println("EL NUMERO NO ES PRIMO:"+nu);
//        } else {
//            System.out.println("EL NUMERO ES PRIMO:"+nu);
//        }
//             
//    }
//        else{
//        System.out.println("ERROR DE CARACTER:");
//    }
//        op.fibonaci();
    }
    
    
    

