/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooguiado2;

/**
 *
 * @author GOYO
 */
public class calculo12 {
    private int numero1;
    private int numero2;
    private String palabra;
    //metodos 
   
    
    public calculo12(){
   int numero1;
   
    }
    public calculo12(int num1, int num2,String palabra)
    {
    this.numero1=num1;
    this.numero2=num2;
    this.palabra=palabra;
    
    
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public String presentarRango(int numinic, int numfin){
    
    
    
     String rangoange="";
        int contador;
        contador= numfin+1;
     
        do{
            rangoange += Integer.toString(contador);
            if(!(contador == numinic-1)){
                rangoange += ",";
            }
            contador++;
        }while(contador < numinic);
        return rangoange ;
  
    }
    public String primosImpares(String rango)
    {
       String primos="";
        int numero;
        boolean ange;
        int vae=2;
        String Vect[] = rango.split(",");
        for (String Vect1 : Vect) {
            ange = false;
            numero = Integer.parseInt(Vect1);
           while(vae<numero){
           if(numero%vae==0){
                    ange=true;
                    break;
                
           }
           vae++;}
           if(ange==false){
                primos+= Integer.toString(numero);
            }
        }
        return primos;
            
   
    }
public boolean palabrainversa(String palabra){

String formada = "";
int hid=0;
while (hid<palabra.length()){
formada= palabra.charAt(hid)+formada;
hid++;
}
        
        
        return formada.equalsIgnoreCase(palabra);

}

}