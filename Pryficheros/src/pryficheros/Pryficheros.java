/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author unemi
 */
public class Pryficheros {
datos ae=new datos();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
// creamos la variable que va a contener la ruta de mi fechero 
String Nombre=JOptionPane.showInputDialog("");
String apellido=JOptionPane.showInputDialog("");
        // creando una instancia de file
File Ang= new File("C:\\Users\\GOYO\\Desktop\\Pryficheros\\src\\pryficheros.txt");
BufferedWriter de;
if(Ang.exists()){
de= new BufferedWriter(new FileWriter(Ang));
de.write(Nombre+"  "+apellido);
}else{de=new BufferedWriter(new FileWriter(Ang));
de.write(Nombre+"  "+apellido);
}de.close();
      
// para que se termine el proceso y pueda usar la letra 
   // fichero =file
   String donde=""; 
   
  FileReader aero=new FileReader(Ang);
   BufferedReader care=new BufferedReader(aero);
   while((donde=care.readLine())!=null){
   
   JOptionPane.showMessageDialog(null, donde);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

   
   
   
   
   
   
   
   
   
   /*
   String ficher="";
    FileReader lector = new FileReader(Ang);
    BufferedReader rd= new BufferedReader(lector);
   //
    while ((ficher=rd.readLine())!= null){
        System.out.println(ficher);
    }
    */
    }    }
    
