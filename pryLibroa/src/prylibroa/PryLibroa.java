/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prylibroa;

/**
 *
 * @author unemi
 */
public class PryLibroa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Libro Biblis=new Libro("50 Sombras de Angelo ",5214554,"Angelo",1997);
    Pagina pag1=new Pagina(5,1);
        Pagina pag2=new Pagina(6,2);
    Pagina pag3=new Pagina(10,3);
    Pagina pag4=new Pagina(9,4);
   // numeroParrafos;  private int numeroLinea;
  //  private String Contenido;

     //   private int numeroLineas;
    Parrafo pa=new Parrafo(3,59);
        Parrafo pa1=new Parrafo(3,35);
        Parrafo pa2=new Parrafo(3,40);
        Parrafo pa3=new Parrafo(3,60);
Lineas li=new Lineas(2,"Donde viene el pre");
Lineas li1=new Lineas(5,"digitales tenemos deberes");
Lineas li2=new Lineas(8,"el jueves es 38");
Lineas li3=new Lineas(10,"la maleta es azul");

Biblis.NumeroPagina(pag1,pa,li);
Biblis.NumeroPagina(pag2,pa1,li1);
   Biblis.NumeroPagina(pag3,pa2,li2);
    Biblis.NumeroPagina(pag4,pa3,li3);
    Biblis.MostratLibro();   
    
    
    }
    
}
