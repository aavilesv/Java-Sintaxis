package pry.alvaro.villagomez;

import javax.swing.JOptionPane;

public class VectorBase {

    protected char vector[];

    public VectorBase(int tamano) {
        this.vector = new char[tamano];
    }

    public void llenarVector() {
        String numero;
        for (int i = 0; i < vector.length; i++) {
             vector[i]= JOptionPane.showInputDialog("Ingrese la palabra").charAt(0);    
        }

    }

    public String MostrarVector() {
        String rescatar1 = "";
        for (int i = 0; i < vector.length; i++) {
            rescatar1 += "\n" + vector[i];
     
        }
        return "El vector es "+rescatar1;
         }
    }
