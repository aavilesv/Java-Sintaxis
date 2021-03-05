/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.guiado;

/**
 *
 * @author GOYO
 */
public class CalculoMatematico {

    private  int Numero;
   
    //metodos 
    public CalculoMatematico() {
    }
    public CalculoMatematico(int Numero) {
        this.Numero = Numero;
    }
    
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        this.Numero = numero;
    }
    
    public int numeroInvertido(int numero){   
    int num = 0; 
    while(numero > 0) { 
        num = num*10 + numero%10; 
        numero /= 10; 
    } 
    return num; 
    } 
    
   
    
    
    public boolean numeroPerfecto(int numero){
           int numero1=numero;   
int angelo=0;
int i=1;
while (i< numero1  ){
if (numero1%i==0){
    angelo+=i;}
i++;

}

if (angelo== numero1){
System.out.println("el numero :"+ numero1 +"  es un numero perfecto;");
return true;
} else {
System.out.println("el numero:"+ numero1    +":no es un numero perfecto ");}
return false;
       
        
        
    }    
    
    
    
      
        public boolean numeroPrimoImpar(int numero){   
         int numero1=numero;
            int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero1)){
         
         
             if (numero1 % contador == 0)
         
              primo = false;
          contador++;
             
          
        }
        return primo;
    }
      


    }


