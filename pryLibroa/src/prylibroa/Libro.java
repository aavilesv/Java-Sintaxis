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
public class Libro {
      private String Titulo;
    private long ISBN;
    private String Autor;
    private int Añopublicacion;
    
// Atributos de composicion 
    private Pagina[] Pagina;// Referncia a muchos elementos de tipo pagina
    private int NumeroPagina;
private Lineas []Linea;

private Parrafo []Parra;

    public Libro(String Titulo, long ISBN, String Autor, int Añopublicacion) {
        this.Titulo = Titulo;
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.Añopublicacion = Añopublicacion;
        //Reservando espacio en memoria para array pagina (instanciar /datos)
   // inicializando pagina
        this.Pagina=new Pagina[999];
     this.Linea =new Lineas[1000];

   this.Parra =new Parrafo[400];

        for (int i = 0; i < Pagina.length; i++) {
            this.Pagina[i]=new Pagina(0, 0);
       
        }
        //contador del numero total de paginas del libro 
    this.NumeroPagina=0;
    }

    public String getTitulo() {
        return Titulo;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAñopublicacion() {
        return Añopublicacion;
    }

    public Pagina[] getPagina() {
        return Pagina;
    }

    public int getNumeroPagina() {
        return NumeroPagina;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setAñopublicacion(int Añopublicacion) {
        this.Añopublicacion = Añopublicacion;
    }

    public void setPagina(Pagina[] Pagina) {
        this.Pagina = Pagina;
    }

    public void setNumeroPagina(int NumeroPagina) {
        this.NumeroPagina = NumeroPagina;
    }

    // insertando una nueva pagina 
   public void NumeroPagina(Pagina NuevaPagina , Parrafo Parra, Lineas Linea){
        if(this.NumeroPagina<Pagina.length){
        this.Pagina[this.NumeroPagina]= NuevaPagina ;
       this.Linea [this.NumeroPagina]=Linea;
               this.Parra [this.NumeroPagina]=Parra;

        }
        this.NumeroPagina++;
    }
   public void Number(Pagina NuevaPagina , Parrafo Parra, Lineas Linea){
        if(this.NumeroPagina<Pagina.length){
        this.Pagina[this.NumeroPagina]= NuevaPagina ;
       this.Linea [this.NumeroPagina]=Linea;
               this.Parra [this.NumeroPagina]=Parra;

        }
        this.NumeroPagina++;
    }
  
    public Pagina getPaginaNumero(int numeroPagina ){
        for (int i = 0; i <this.NumeroPagina; i++) {
            if(this.Pagina[i].getNumero()==numeroPagina){
             return this.Pagina[i];
            }
    }
    // caso de no econtadar el elemento 
return null;}
    
    public void MostratLibro(){
        System.out.println("Libro :{\n"+
                "Titulo:"+this.Titulo+"\n"+"ISNB:"+this.ISBN+"\n"+"Autor:"+this.Autor+"\n"+
        "Año de publicacion:"+this.Añopublicacion+"\n"
      +  "Pagina:{");
        for (int i = 0; i < this.NumeroPagina; i++) {
            System.out.println(" NumeroPAgina:["+this.Pagina[i].getNumero()+"]"+
         " Numero parrafo:  ["+this.Pagina [i].getNumeroParrafos()+"]\t"+
                    
                    
                    "   Numero de linea:["+this.Parra[i].getNumeroLineas()+"]"+"  Contenido:["+this.Linea[i].getContenido()+"]"
                    
                    
                    
            
            );
        }
        System.out.println("             \n  }             \n}");
       
    }
}
