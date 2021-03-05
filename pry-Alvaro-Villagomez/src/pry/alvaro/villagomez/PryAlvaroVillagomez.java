package pry.alvaro.villagomez;

import javax.swing.JOptionPane;

public class PryAlvaroVillagomez {

    public static void main(String[] args) {

        
        int opciones = 0;
        int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
        Contador co= new Contador(tamano);
       do{
        opciones = Integer.parseInt(JOptionPane.showInputDialog("MENU \n 1 -  LLENAR EL VECTOR \n 2 - CONTAR VOCALES \n 3 - CONTAR CONSONANTES \n 4 - MOSTRAR VECTOR \n 5 -  SALIR"));
       
        switch (opciones) {
            case 1:
                co.llenarVector();break;
            case 2:
                JOptionPane.showMessageDialog(null, co.contadorVocales());break;
            case 3:
                JOptionPane.showMessageDialog(null, co.contadorConsonantes());break;
            case 4:
              
                co.Presentar();
                JOptionPane.showMessageDialog(null, co.MostrarVector());break;

        }
        }while(opciones!=5);
       
    }

}
