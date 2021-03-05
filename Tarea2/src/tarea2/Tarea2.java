
package tarea2;

import java.util.Scanner;

/**
 *
 * @author Kleyner
 */
public class Tarea2 {

    public static void main(String[] args) {
        int Num1, Num2;
        String palabra;
      
        Calculo cal = new Calculo();
        Scanner obj = new Scanner(System.in);
        
        // Ejercicio 1
        do{
            System.out.println("Ingrese Numero 1");
            Num1 = obj.nextInt();
        }while(Num1<=1);
        
        do{
            System.out.println("Ingrese Numero 2");
            Num2 = obj.nextInt();
        }while((Num2-Num1)!=3 && (Num2-Num1)!=-3 );
        
        cal.setNumero1(Num1);
        cal.setNumero2(Num2);
        
        if(cal.getNumero1()<cal.getnumero2()){
            cal.setNumero1(Num2);
            cal.setNumero2(Num1);
        }
        
        System.out.println("El rango entre "+cal.getNumero1()+" y "+cal.getnumero2()+" es: "+cal.presentarRango(cal.getNumero1(), cal.getnumero2()));
        
        //Ejercicio 2
        
        String rango;
        rango= cal.presentarRango(cal.getNumero1(), cal.getnumero2());
        cal.primosImpares(rango);
        if(cal.primosImpares(rango).equals("")){
            System.out.println("No se han encontrado primos impares en el rango");
        }else{
            System.out.println("Los numeros primos son: "+cal.primosImpares(rango));
        }
        
        //Ejercicio 3 
        
        System.out.println("Ingrese la palabra a invertir");
        palabra = obj.next();
        cal.palabraInversa(palabra);
        if(cal.palabraInversa(palabra)==false){
            System.out.println("La palabra es palindroma");
        }else{
            System.out.println("La palabra no es palindroma");
        }
    }
    
}
