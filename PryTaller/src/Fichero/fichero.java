package Fichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class fichero {

    protected int ruta;

    File archivo = new File("Fichero.txt");//creando insatnacia de la FIle

    BufferedWriter wr;
    FileWriter fi;

    public void LLenarFichero(String numero) throws IOException {

        if (archivo.exists()) {
            fi = new FileWriter(archivo);
            wr = new BufferedWriter(fi);
            wr.write(numero);
            wr.newLine();
            
        } else {
            fi = new FileWriter(archivo);
            wr = new BufferedWriter(fi);
            archivo.createNewFile(); // aki lo creamos el fichero automaticamente
            wr.write(numero);
            wr.newLine();
             
        }
        wr.close();

    }

    public void sumar() throws FileNotFoundException, IOException {
        int sumador = 0;
        String fich = "";
        FileReader lector = new FileReader(archivo.getAbsoluteFile());// obtengo la ruta
        BufferedReader rd = new BufferedReader(lector);
        while ((fich = rd.readLine()) != null) {
            sumador = Integer.parseInt(sumador + fich);
        }
    }

}
