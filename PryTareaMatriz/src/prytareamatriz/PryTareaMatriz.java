/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prytareamatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author Jenny Bernal
 */
public class PryTareaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ba = 0;
        int numero = 0;

        int opciones = 0;
        int tamano1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la fila"));

        int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la columna"));

        Matriz Ma = new Matriz(tamano1, tamano);

        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("MENU \n 1 -  LLENAR la MATRIZ \n 2 - BUSCAR NUMERO \n 3 - ELIMINAR NUMERO \n  4 - Modificar NUMERO \n 5 - PRESENTAR \n  6 -  SALIR"));

            switch (opciones) {
                case 1:
                      //---------------------------------------------------------------------------------------------------
  // Valida que si no esta llena la matriz no se pueda presentar nada esto es con ba==1 case 1
                    ba = 1;
                    Ma.Ingresar();
                    break;

                case 2:
                    if (ba == 1) {

                        do {
                            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero a buscar"));
                        } while (!Ma.Buscar(numero));

                    } else {
                        JOptionPane.showMessageDialog(null, "LLenar Matriz");
                    }
                    break;
                case 3:
                    if (ba == 1) {
                        do {
                            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero  a eliminar "));
                        } while (!Ma.Buscar(numero));
                        Ma.eliminar();

                    } else {
                        JOptionPane.showMessageDialog(null, "LLenar Matriz");
                    }
                    break;
                case 4:
                    if (ba == 1) {
                        do {
                            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor a Modificar "));

                        } while (Ma.Modificar(numero));
                    } else {
                        JOptionPane.showMessageDialog(null, "LLenar Matriz");
                    }
                    break;
                case 5:
                    if (ba == 1) {
                        JOptionPane.showMessageDialog(null, Ma.Presentar());
                    } else {
                        JOptionPane.showMessageDialog(null, "LLenar Matriz");
                    }
                    break;

            }
        } while (opciones != 6);

    }

}
