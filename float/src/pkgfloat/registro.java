/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfloat;

/**
 *
 * @author GOYO
 */
public class registro {
    float a[][];
    int indicefila;
    int indicecolumna;
    int tamañoColumna;
    int tamañofila;
    public registro(int fila, int columna ){
    this.tamañoColumna=columna;
    this.tamañofila=fila;
    this.a=new float [fila][columna];
    this.indicecolumna=0;
    this.indicefila=0;}
    
    public void settamañofila(int tamañofila){this.tamañofila=tamañofila;}

    public int getIndicefila() {
        return indicefila;
    }

    public int getIndicecolumna() {
        return indicecolumna;
    }

    public int getTamañoColumna() {
        return tamañoColumna;
    }

    public int getTamañofila() {
        return tamañofila;
    }

    public void setIndicecolumna(int indicecolumna) {
        this.indicecolumna = indicecolumna;
    }

    public void setTamañoColumna(int tamañoColumna) {
        this.tamañoColumna = tamañoColumna;
    }

    public void setTamañofila(int tamañofila) {
        this.tamañofila = tamañofila;
    }
  public void setIndicefila(int tamaño){
  this.indicefila=tamaño;}
public boolean ingresar(float numero){
if(indicecolumna<tamañoColumna){
    numero=(int)Math.pow(numero, 2);
    a[indicefila][indicecolumna]=numero;
    indicecolumna++;

}else{if(indicefila==tamañofila-1){
    
    return false;}else {
    if(indicefila<tamañofila){
     numero=(int)Math.pow(numero, 2);
indicefila++;
indicecolumna=0;
a[indicefila][indicecolumna]=numero;

}}
            
}
return true;}
public String presentar(){
String cade="";
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            cade+="  "+a[i][j];
        }cade+="\n";
    }


return cade;}
}
