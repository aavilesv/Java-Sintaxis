
package prytaller;

import javax.swing.JOptionPane;

public class VectorBase {
     protected char vector[];

    public VectorBase(String palabra) { // inicializamos el vector 
         int  saul= palabra.length();
         this.vector = new char[saul];
    }
    public void llenarVector(String palabra) {// llenamos el vector char
       for (int i = 0; i < vector.length; i++) {
             vector[i]= palabra.charAt(i);    
        }
       
    }
    public String  presentarVector(){ // aki concatenamos el vector 
        String concatenar= "";
        for (int i = 0; i < vector.length; i++) {
             concatenar+= vector[i]+"\n";
        }
         return "El vector es \n"+ concatenar;
    }
    public Boolean Invertir(String pala)
    {   
        int cont=1;
        for(int i=0 ; i<pala.length();i++)
        {
            if(pala.charAt(i)!=pala.charAt(pala.length()-1-i))
            {
                cont=0;break;
            }
        }
        return cont==1;
    }
    
      public String  palabraPalidromo(){ // aki concatenamos el vector 
        String concatenar= "";
        for (int i = 0; i < vector.length; i++) {
             concatenar+= vector[i];
        }
         return "la palabra palidroma es : \n"+ concatenar;
    }
      
}
