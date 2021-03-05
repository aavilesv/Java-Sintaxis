package pryarreglos1;

import javax.swing.JOptionPane;

public class PryArreglos1 {
    
    public static void main(String[] args) {
        vector a = new vector();
        a.inicilaizarvector(5);
        do {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + a.getIndice()));
            if (a.getIndice() == 0) {
                while (a.perfecto(numero) == false) {//pregunto si el numero es perfecto
                    JOptionPane.showMessageDialog(null, "El numero no es perfecto");
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero perfecto"));
                    a.perfecto(numero);
                }
                a.ingresar(numero);//si es perfecto lo guardo
            } else if (a.buscar(numero) == true) {//si no esta en la posicion uno lo busco dentro del arreglo 
                JOptionPane.showMessageDialog(null, "El numero esta repetido");
            } else if (a.perfecto(numero) == false) {// preguinto si es perfecto 
                do {
                    JOptionPane.showMessageDialog(null, "El numero no es perfecto");
                    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero perfecto"));
                } while (a.perfecto(numero) == false);//repito si el numero no es perfecto 
                a.ingresar(numero);//aki ingreso el numero si es perfecto 
            } else {
                if (a.buscar(numero) == true) {// aki lo busco si el numero es perfecto dentro del arreglo 
                    JOptionPane.showMessageDialog(null, "Esta repetido");
                } else {
                    a.ingresar(numero);//estoy ingresando los valores cando son perfecto y no se repite 
                }
            }
        } while (a.getIndice() < a.getTamaño());//para que el arreglo se llene todo 
        JOptionPane.showMessageDialog(null, a.presentar());// aki presento todos lo numeros dentro del arreglo 
    }

}
