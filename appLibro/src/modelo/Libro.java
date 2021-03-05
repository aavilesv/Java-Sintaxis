
package modelo;

/**
 *
 * @author martillo
 */
public class Libro 
{
    private String titulo;
    private String autor;
    private String editorial;
    private int cantidadTotal;
    private int cantidadPrestada;

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public String getAutor() 
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getEditorial() 
    {
        return editorial;
    }

    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }

    public int getCantidadTotal() 
    {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) 
    {
        this.cantidadTotal = cantidadTotal;
    }

    public int getCantidadPrestada() 
    {
        return cantidadPrestada;
    }

    public void setCantidadPrestada(int cantidadPrestada) 
    {
        this.cantidadPrestada = cantidadPrestada;
    }
    public Libro (String titulo,String autor,String editorial , int total)
    {
       this.titulo =titulo;
       this.autor= autor;
       this.editorial= editorial;
       cantidadTotal= total;
      
    }
       public boolean disponerLibro()
       {
        return cantidadPrestada<cantidadTotal;
       }
       public String darLibro()
       {
         cantidadPrestada += 1;
        return "Libro numero:"+cantidadPrestada+" - "+titulo+" - "+autor+" - "+editorial;
    } 
       public void devcolverLibro()
       {
         cantidadPrestada-=1;
       }
       public String presentarInforme()
       {
           return"Libro prestados:"+cantidadPrestada+"-"+"Cantidad total de libros:"+cantidadTotal+
                   "titulo:"+titulo+"-"+"autor:"+autor+"-"+"editorial:"+editorial;
       }

    @Override
    public String toString()
    {
        return "Libro prestados:"+cantidadPrestada+"-"+"Cantidad total de libros:"+cantidadTotal+
                   "titulo:"+titulo+"-"+"autor:"+autor+"-"+"editorial:"+editorial;
    }
       
}
