package prymatriz1;

import javax.swing.JOptionPane;

public class PryMatriz1 {

    public static void main(String[] args) {

        int opciones = 0;
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de  fila"));// pedir las filas
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de  columna"));// pide las columna

        Orientado o = new Orientado(fila, columna);
        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("MENU \n  1 .  lLENAR \n 2 .PRESENTAR \n 3 . Eliminar\n 4.  SALIR"));

            switch (opciones) {
                case 1:
                    o.llenarMatriz();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, o.mostrarMatriz());
                    break;
                case 3:
                    int fil = 0, co=0;
                    do{
                    fil = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fila"));
                     co = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la columna"));
                    if(fil>o.getTamañoFila() ||co>o.getTamañoColumna()){
                        JOptionPane.showMessageDialog(null, "EL numero no exist");
                    }
                    }while(fil>o.getTamañoFila() ||co>o.getTamañoColumna());
                    o.eliminar(fil, co);
                    
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Mucghas gracias por su consulta");
            }

        } while (opciones != 4);
    }
}
