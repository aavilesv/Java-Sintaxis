/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryimpuesto2c2;

import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class PryImpuesto2C2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Impuesto_verde ange= new Impuesto_verde();  
int opcion=0; int numero=0;


        do{
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor "+"\n"+"Nª  Antiguedad      Factor fa"+"\n"+"1. Menor a 5 años    0.0"+"\n"+"2. De 5 a 10 años     0.05"+"\n"+"3. De 11 a 15 años     0.01"+"\n"+"4. De 16 a 20 años     0.15"+"\n"));
       
        }while(!ange.antiguedad(numero));
numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un  valor del cilindraje " ));     

  ange.T(numero);
     do{ 
         if(ange.T(numero)==false){
          JOptionPane.showMessageDialog(null, " Error en el rango de la T ");
numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nuevo valor del cilindraje " ));     
         }
         else{
    JOptionPane.showMessageDialog(null,"cilindres es:"+ange.getCilibraje()+"\n"+"Nª  t igual      "+"\n"+"1. Menor a 1500     0"+"\n"+"2. 1501-2000     0.08"+"\n"+"3.  2001-2500     0.09"+"\n"+"4.  2501  -3000 0.11"+"\n"+"5.  3001-3500 0.12");
         }
     }while(!ange.T(numero));
      JOptionPane.showMessageDialog(null, "el valor del impuesto verde es:  "+ange.ImpuestoCal());
}}
