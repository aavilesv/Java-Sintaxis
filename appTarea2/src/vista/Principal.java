
package vista;

import java.util.Scanner;
import modelo.Calculo;

/**
 *
 * @author Personal
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n1, n2; String pal = "";
        
        System.out.println("Ingrese numero 1");
        n1 = sc.nextInt();
        System.out.println("Ingrese numero 2");
        n2 = sc.nextInt();
        System.out.println("Ingrese palabra");
        pal = sc.next();
        

        Calculo cal = new Calculo(n1,n2,pal);
        
        System.out.println(cal.presentarRango(cal.getNumero1(),cal.getNumero2()));
        
        System.out.println(cal.primosImpares(cal.presentarRango(cal.getNumero1(),cal.getNumero2())));
        
        System.out.println(cal.palabraInversa(cal.getPalabra()));
    }
    
}
