package arreglos;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        
        Arreglo arr=new Arreglo();
        Scanner leer = new Scanner(System.in);

        int numero[] = new int[10];//asi se define un arreglo

        for (int i = 0; i < numero.length; i++) //aki vamos a ingresa los valores 
        {
            System.out.println("Ingrese numero " + (i + 1));
            numero[i] = leer.nextInt();
            arr.Ingresar(i, numero[i]);//aki le estamos enviando los vbalores al arreglo el indice y el arreglo asi se hace
            while(arr.numeroRepetido(numero[i], i))
            {
                 numero[i] = leer.nextInt();  // aqui estoy ingresando nuevos numeros porque son repetidos
            }
          
        }  
        arr.Mostrar();//aki no ponemos un system.out.println porque ya tenemos presentacion en el otro lado 
        
        //Aqui estoy presentando la sumatoria de los numeros pares e impares 
        System.out.println("La suma de los numeros pares son "+arr.sumaPar());
        System.out.println("La suma de los numeros impares son "+arr.sumaImpar());
        

    }

}
