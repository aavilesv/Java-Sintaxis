package pryarreglos1;

import javax.swing.JOptionPane;

public class vector {

    private int[] vector;
    private int tamaño;
    private int indice = 0;

    public vector() {

    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    // se inicia los valores
    public void inicilaizarvector(int tamaño) {
        this.tamaño = tamaño;
        vector = new int[tamaño];

    }

    //aki veo los numeros perfectos

    public boolean perfecto(int numero) {

        int suma = 0;
        for (int k = 2; k <= numero; k++) {
            if (numero % k == 0) {
                suma = suma + (numero / k);
            }
        }
        if (suma != numero) {
            return false;

        } else {
            return true;
        }

    }

    // voy a asignar valores en el vector
    public int darvalores() {
        int rescatar = 0;
        if (this.indice == 0) {
            do {
                rescatar = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR PARA LA POSICION" + indice));
                if (perfecto(rescatar)) {
                    vector[indice] = rescatar;
                }
            } while (!perfecto(rescatar));
            rescatar = rescatar * 2;
            if (rescatar > 9) {
                rescatar = rescatar - 9;
            }
            this.indice++;
            vector[indice] = rescatar;
        } else {
            indice++;
        }
        return indice;
    }

    public int getTamaño() {
        return tamaño;
    }

    //veo el numero perfecto

    public boolean buscar(int numero) {
        boolean encontrado = false;
        for (int i = 0; i < this.indice && encontrado == false; i++) {
            if (vector[i] == numero) {
                encontrado = true;

            }
        }
        return encontrado;
    }

    //ingreso de los numeros

    public void ingresar(int numero) {
        vector[this.indice] = numero;
        this.indice++;
    }

    //aki voy a presentar los resultados del vevtor 
    public String presentar() {
        String resultado = "";
        for (int i = 0; i < this.tamaño; i++) {
            resultado = resultado + "" + String.valueOf(vector[i]) + "\n";
        }
        return resultado;
    }
}
