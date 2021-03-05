/*
 Realizar un proyecto en NetBeans en el lenguaje Java, las 12 tablas de multiplicar.
 */
package tabla.de.multiplicaciones;

/**
 *
 * @author Kimberlin Cardenas
 */
public class TablaDeMultiplicaciones {

    public static void main(String[] args) {
        int cont=1, tb=1;
        // Proceso While
        System.out.println("Tablas de multiplicar del 1-12 con proceso while");
        while(cont<=12)
        {    
            System.out.println("Tabla del número " +cont);
            while(tb<=12)
                {
                    System.out.println(cont+"*"+cont+"=" + cont*tb);
                    tb=tb+1;                  
                }
             cont=cont+1;
             tb=1;
        }
        
        //  Proceso Do while
        System.out.println("Tablas de multiplicar del 1-12 con proceso do while");
        cont=1;
        do{
            System.out.println("Tabla del número " +cont);
            do{
                System.out.println(cont+"*"+tb+"=" + cont*tb);
                tb=tb+1;               
            }while(tb<=12); 
            cont=cont+1;
            tb=1;
          }while(cont<=12);
        
        
        //Proceso For
        System.out.println("Tablas del 1-12 con proceso for");
        for(int i=1;i<=12;i++){
            System.out.println("Tabla del número " +i);
            for(int j=1;j<=12;j++){
            System.out.println(i+"*"+j+"=" +i*j);
                                  }
                              }     
  }      
}        
    

