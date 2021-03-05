/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero1.datosPersona;
import fichero1.cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 */
public class datospersona {
    
     public String creString(cliente a){
    try{
        // file es crear el archivo
     File ar=new File("C:\\Users\\GOYO\\Desktop\\programacion\\fichero1\\src\\fichero1\\guardarfichero\\cliente2.txt");// ponemos la direccion de donde damos a guardar 

     
     FileWriter archivo=new FileWriter(ar); // escribimos en el archivo 
 BufferedWriter err=new BufferedWriter(archivo);
 err.write(a.getDireccion()+","+a.getNombre()+","+a.getNumero()+","+a.getSexo()+","+a.getCantidad());
 err.newLine();
 err.close();
    }catch(Exception e){
    return "no guardado ";
    }
     return "datos guardado";
     }
     
     
     public String Modificar(cliente s){
         String linea="";
         File ar=new File("C:\\Users\\GOYO\\Desktop\\programacion\\fichero1\\src\\fichero1\\guardarfichero\\cliente2.txt");
         File aux=new File("C:\\Users\\GOYO\\Desktop\\programacion\\fichero1\\src\\fichero1\\guardarfichero\\auxcliente2.txt");
try {
    FileWriter se=new FileWriter(aux);
BufferedWriter era=new BufferedWriter(se);
FileReader er=new FileReader(ar);
BufferedReader es=new BufferedReader(er);
while((linea=es.readLine())!=null){
era.write(s.getDireccion()+","+s.getNombre()+","+s.getNumero()+","+s.getSexo()+","+s.getCantidad());
era.newLine();
era.close();
es.close();
}
}catch(Exception e){
return "no se ah modificado";
}    
         return "se ah modificado";}
             
             
             
             
             
     
     
     
     
     
     
     
     
     
     
     
     
     /*
     public String Modificar(cliente a){
         File arc=new File("C:\\Users\\GOYO\\Desktop\\fichero1\\src\\fichero1\\guardarfichero\\cliente.txt");
  File aux=new File("C:\\Users\\GOYO\\Desktop\\fichero1\\src\\fichero1\\guardarfichero\\auxcliente.txt");
String Linea="";
  try {FileWriter ar=new FileWriter(aux);
BufferedWriter f=new BufferedWriter(ar);
FileReader er=new FileReader(arc);
BufferedReader orr=new BufferedReader(er);
while((Linea=orr.readLine())!=null){
    
    f.write(a.getDireccion()+","+a.getNombre()+", "+a.getNumero()+","+a.getSexo()+","+a.getCantidad());
    f.newLine();
    f.close();

}

}catch(Exception e){return "";}
         return "";}*/
     
}
