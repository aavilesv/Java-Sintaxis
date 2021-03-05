package pry.alvaro.villagomez;

import javax.swing.JOptionPane;

public class Contador extends VectorBase {
private char arreglo[];
private String cadena="";
    public Contador(int tamano) {
        super(tamano);
    this.arreglo=new char[tamano];
    }
public boolean Palidromo(){
    for (int i = 0; i < arreglo.length; i++) {
        arreglo[i]=vector[arreglo.length-1-i];
        
        if(arreglo[i]==vector[arreglo.length-1-i]){
            cadena+="["+i+"]"+arreglo[i]+"\n";
        }else{
            return false;};
        
    }
  
return true;}
//return false;
public void Presentar(){
  if(Palidromo()){
        JOptionPane.showMessageDialog(null, "La palabra es polindroma\n"+cadena);
cadena="";
  }else{
      JOptionPane.showMessageDialog(null, "la palabra no es polindromo");
}
}

    public String contadorVocales() {
        int contador = 0;
        for (int x = 0; x < vector.length; x++) {
            if ((vector[x] == 'a') || (vector[x] == 'e') || (vector[x] == 'i') || (vector[x] == 'o') || (vector[x] == 'u')) {
                contador++;
            }
        }
        return "En el vector hay " + contador + " vocales";

    }

    public String contadorConsonantes() {
        int sumador = 0;
        for (int x = 0; x < vector.length; x++) {
            if ((vector[x] != 'a') && (vector[x] != 'e') && (vector[x] != 'i') && (vector[x] != 'o') && (vector[x] != 'u')) {
                sumador= sumador+1;
            }
        }
        return "En la palabra existen " + sumador + " consonantes";
    }
}
