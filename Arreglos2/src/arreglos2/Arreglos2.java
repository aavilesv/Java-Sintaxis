package arreglos2;

import java.util.Scanner;

public class Arreglos2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        long numero = 0, suma = 0, h = 0;
        long numeros[] = new long[10];
        System.out.println("En las posiciones pares estaran los primos");
        System.out.println("En las posiciones impares estaran perfectos");

        for (int i = 0; i < numeros.length; i++) {

            do {
                h = 0;
                suma = 0;
                System.out.println("");
                System.out.println("---- posicion ---- " + "(" + i + ")");
                if (i % 2 == 0) {
                    System.out.println(" posicion par - primo-");
                } else {
                    System.out.println("posicion impar -perfecto-");
                }
                numero = leer.nextLong();
                numeros[i] = numero;

                for (int j = 0; j < i; j++) {

                    while (numero == numeros[j]) {
                        System.err.println("--numero repetido repetido-- ");
                        System.err.println("--Inrese un numero que no este repetido-- ");
                        numero = leer.nextLong();
                    }
                }
                numeros[i] = 0;

                if (i % 2 == 0) {

//            numeros primosss
                    for (int k = 1; k <= numero; k++) {
                        if (numero % k == 0) {
                            h++;
                        }
                    }
                    if (h == 2) {

                        System.out.println("Es primo");
                        numeros[i] = numero;

                    } else {
                        System.err.println("No es primo");
                        System.err.println("Ingrese un numero primo ");

                    }
                } else if (i % 2 != 0) {
//            numero perfecto 

                    for (int k = 2; k <= numero; k++) {
                        if (numero % k == 0) {
                            suma = suma + (numero / k);
                        }
                    }
                    if (suma == numero) {
                        if (i == 1) {
                            numeros[i] = numero;
                        }
                        if (i % 2 != 0) {
                            System.out.println("Es perfecto");
                            numeros[i] = numero; // guardo los datos 

                        }
                    } else {
                        System.err.println("No es perfecto");
                        System.err.println("Ingrese un numero perfecto");

                    }
                }
            } while (suma != numero && h != 2); // si no es primo y no es perfecto pido otro 
        }
        System.err.println("");
        System.out.println("Los numeros guardados en el arreglo son ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros [" + i + "] :" + numeros[i]);

        }

    }
}
