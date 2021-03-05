package prymatriz1;

import javax.swing.JOptionPane;

public class Orientado {

    int[][] matriz;
    protected int fila = 0;
    protected int columa = 0;
    protected int tamañoFila=0;
    protected int tamañoColumna=0;

   
    public Orientado(int filas, int columnas) {
        this.tamañoFila=filas;
        this.tamañoColumna=columnas;
        matriz = new int[filas][columnas];
    }

    public int getTamañoFila() {
        return tamañoFila;
    }

    public void setTamañoFila(int tamañoFila) {
        this.tamañoFila = tamañoFila;
    }

    public int getTamañoColumna() {
        return tamañoColumna;
    }

    public void setTamañoColumna(int tamañoColumna) {
        this.tamañoColumna = tamañoColumna;
    }
    


    public void llenarMatriz() {
        int auxi = 0;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                do {
                    auxi = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor en la posicion  " + "[" + f + "]" + "[" + c + "]"));
                    if (Repetidos(auxi, f, c)) {
                        JOptionPane.showMessageDialog(null, "El numero esta repetido ");
                    }
                } while (Repetidos(auxi, f, c));
                matriz[f][c] = auxi;
            }
        }

    }

    public String mostrarMatriz() {
        //aki presento la matriz 
        String cadena = "--LA MATRIZ ES -- \n";
        for (int f = 0; f < matriz.length; f++) { 
            for (int c = 0; c < matriz[f].length; c++) {
                cadena = cadena + " - " + matriz[f][c];
            }
            cadena = cadena + "\n";
        }
        return cadena;
    }

    public boolean Repetidos(int ma, int fil, int col) {
        boolean t = false;
        for (int f = 0; f <= fil; f++) {
            for (int c = 0; c <= col; c++) {
                if (ma == matriz[f][c]) {
                    t = true;
                    break;
                }

            }
        }
        return t;
    }

     public void eliminar(int fila,int columna){
     boolean reeordenado=false;
     int auxiliar=0;
     if(fila==tamañoFila-1)
     {
         auxiliar=fila;
     }
     else
     {
         auxiliar=0;
     }
            for(int j=columna; j<tamañoColumna&&reeordenado==false;j++){
                if(j<tamañoColumna-1){
                    matriz[fila][j]=matriz[fila][j+1]; 
                }   
                    else if(fila<tamañoFila-1){
                        matriz[fila][j]=matriz[fila+1][0];
                        fila++;
                        reeordenado=true;
                    }
                    
                            else{
                                reeordenado=true;
                            }
            }
            
            reeordenado=false;
            if(fila<tamañoFila){
                for(int i=fila; i<tamañoFila; i++){
                    reeordenado=false;
                    if(fila==tamañoFila-1){
                    
                    
                        for(int  k=auxiliar;k<tamañoColumna&&reeordenado==false;k++){
                            if(k<tamañoColumna-1){
                                matriz[i][k]=matriz[i][k+1];
                            }
                                else if (i<tamañoFila-1){  
                                    matriz[i][k]=matriz[i+1][0];
                                    reeordenado=true;
                                }
                                    else if (i==tamañoFila-1&&k==tamañoColumna-1){
                                        matriz[i][k]=0;
                                        reeordenado=true;
                                    }
                                        else{
                                            reeordenado=true;
                                        }
                        }
                    }
                    
                }
            }
    }

   
}
