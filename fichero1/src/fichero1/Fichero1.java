/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero1;

import fichero1.datosPersona.datospersona;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author GOYO
 */
public class Fichero1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{ 
    /*
                String sex=JOptionPane.showInputDialog("ingrese sexo");

        String cadena=JOptionPane.showInputDialog("ingrese nombre");
                String cadena1=JOptionPane.showInputDialog("ingrese direccion");
long num=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
long cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese cantudad"));

cliente as= new cliente(sex,num,cadena,cadena1,cantidad,5,5);   

    datospersona a=new datospersona();
    a.creString(as);
    JOptionPane.showMessageDialog(null, a.creString(as));
    as.setNombre("donde vives");
    as.setDireccion("angelo");
    as.setNumero(34);
    a.Modificar(as);*/


    File ang=new File("54");
    BufferedWriter ar;
    if(ang.exists()){
    ar=new BufferedWriter(new FileWriter(ang));
    ar.write("donde sale");
    }else {
     ar=new BufferedWriter(new FileWriter(ang));
    ar.write("no se guardo");
    }
    ar.newLine();
    ar.close();
    
    String cadena="";
    FileReader ae= new FileReader(ang);
    BufferedReader awe=new BufferedReader(ae);
    while((cadena=awe.readLine())!=null){
    JOptionPane.showMessageDialog(null, cadena);
    
    
    }
    
    }}
