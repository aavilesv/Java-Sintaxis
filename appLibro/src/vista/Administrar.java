
package vista;
import java.util.Scanner;
import modelo.Libro;
/**
 *
 * @author Martillo
 */
public class Administrar {

    
    public static void main(String[] args) 
    {
       String titulo,autor,editorial;
       int cantidad;
       
       Scanner sc= new Scanner(System.in);
       
        System.out.println("ingrese titulo del libro: ");
        titulo= sc.next();
        System.out.println("ingrese autor del libro: ");
        autor= sc.next();
        System.out.println("ingrese editoraial del libro: ");
        editorial = sc.next();
        System.out.println("ingrese cantidad  del libro: ");
        cantidad= sc.nextInt();
       
        Libro lb = new Libro(titulo, autor, editorial , cantidad);
     
         while(lb.disponerLibro()==true)
         {
             System.out.println(lb.darLibro());  
         }
       
    }
    
}
