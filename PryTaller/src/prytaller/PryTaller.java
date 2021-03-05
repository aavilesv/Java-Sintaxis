/*1.- Escribir un programa que llene un vector tipo char de n elementos . Deberá verificar si dicha palabra es palindroma y presentar un mensaje según sea el caso.

Ejemplo

: dado el vector ala el programa debería imprimir “Palabra palindroma”

 

Nota: el tamaño debe ajustarse a la cantidad de letras que tenga la palabra.*/
package prytaller;

import javax.swing.JOptionPane;

public class PryTaller {

    public static void main(String[] args) {
  
    JOptionPane.showMessageDialog(null,"Este programa presenta el vector \n  determina si una palabra es palidroma");// presentamos que es una palabra palidroma
        String palabra="";
        palabra =JOptionPane.showInputDialog("Ingrese palabra");
        VectorBase bas= new VectorBase(palabra);// instaciamos la clase y luego con la palabra le dimo el valos al vector 
        bas.llenarVector(palabra);// llenamos el vector 
        JOptionPane.showMessageDialog(null, bas.presentarVector());// presentamos el vector 
        if(bas.Invertir(palabra)){   // preguntamos si la palabra es palidromo
            JOptionPane.showMessageDialog(null, "La palabra es palidromo");
            JOptionPane.showMessageDialog(null, bas.palabraPalidromo());
        }else{
            JOptionPane.showMessageDialog(null, "No es palidromo");
        }
        
    }
    
}
