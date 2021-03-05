package arreglos;

public class Arreglo {

    private int numeros[] = new int[10];

    public void Ingresar(int i, int numero) {
        this.numeros[i] = numero;//aki estamos obteniendo los valores del main
        

    }

    public void Mostrar() {
        System.out.println("Los numero ingresados son");
        for (int i = 0; i < numeros.length; i++) {//aqui estamos presentando los valores
            System.out.println("numero " + (i + 1) + " = " + numeros[i]);
        }

    }
    public boolean numeroRepetido(int numero, int i)
    {
        for(int j=0;j<i;j++)
        {
           if(numero==numeros[j])
           {
               System.err.println("El numero esta repetido");
               System.err.println("Ingrese uno correcto");
               return true;
               
           }
        }
        return false;
    }
    public int  sumaPar() // proceso para los numeros pares 
    {
        int par=0;
        System.out.println("Los numero pares son");
        for(int i=0;i<10;i++)
        {
            if(numeros[i]%2==0)
            {
                par=par+numeros[i];
                System.out.println(numeros[i]);
            }
        }
        return par;
    }
    public int sumaImpar() // proceso para los numeros impares
    {
        int impar=0;
        System.out.println("Los numero impares son");
        for(int i=0;i<10;i++)
        {
            if(numeros[i]%2!=0)
            {
                impar=impar+numeros[i];
                System.out.println(numeros[i]);
            }
        }
        return impar;
  
    }
    
    
    

}
