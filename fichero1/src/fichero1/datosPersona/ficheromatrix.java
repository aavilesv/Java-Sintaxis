/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero1.datosPersona;
import fichero1.matriz;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author GOYO
 */
public class ficheromatrix {
    public String Crear(matriz a){
        int [][]cadena=a.getMatriz();
        String linea=String.valueOf(cadena);
       try { File archivo= new File("");
       FileWriter archi=new FileWriter(archivo);      
           BufferedWriter as=new BufferedWriter(archi);
          
        //
         
           as.newLine();as.close();
       }catch(Exception esr)
               {return "falla al crear "
                       ;}
        return "se creo con existo";}
}
