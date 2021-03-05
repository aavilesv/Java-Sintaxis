/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author unemi
 */
public class Vector {
    private int indice;
    private int nota[];
    public Vector(int tamaño){
    this.nota=new int [tamaño];
    indice =0;
    }

    public int getIndice() {
        return indice;
    }

    public int[] getNota() {
        return nota;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setNota(int[] nota) {
        this.nota = nota;
    }
    public boolean insertar(int numero){
    
    if(indice < nota.length){
    nota[indice]=numero;
    indice++;
    return indice < nota.length;
   
    }
    else {return false;}
   
    }
    public int numeromenor(){int numero=0; 
    
    for(int a=0;a<nota.length;a++){
        for (int indice = 0; indice < nota.length; indice++) {
 if(nota[a]<nota[indice]){
          numero=nota[a];
    nota[a]=nota[indice];nota[indice]=numero;
    }
    }
    }indice=0;
    numero=nota[indice];    return numero;}
    // create read updare delete 
  //  C   R U D 
   public int numeromayor(){int numero=0; 
    int na=0;
    for(int a=0;a<nota.length;a++){
        for ( na = 0; na < nota.length; na++) {
 if(nota[a]<nota[na]){
          numero=nota[a];
    nota[a]=nota[na];nota[na]=numero;
    }
    }
    }
    numero=nota[na-1];    return numero;}

public int promedio(){
    int numero=0;int nue=0;
    for (int i = 0; i < nota.length; i++) {
numero+=nota[i];
nue++;    }
numero/=nue;
return numero;
}

}
