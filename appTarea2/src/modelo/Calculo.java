
package modelo;

public class Calculo 
{
    private int numero1;
    private int numero2;
    private String palabra;
    
    public Calculo(){
        
    }
    
    public Calculo(int numero1,int numero2, String palabra){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.palabra = palabra;
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
    
    public String presentarRango(int n1, int n2){
        String ran = "";
        for(int i=n1+1;i<n2;i++){
           if(i==n2-1){
               ran+= i;
           }else{
           ran+= i + ",";}
        }
        return ran;
    }
    
    public String primosImpares(String rango){
        String vec[] = rango.split(",");
        String primos = "";
        for (String vec1 : vec) {
            if (prim(Integer.parseInt(vec1)) && Integer.parseInt(vec1) != 2) 
            {
                primos += vec1 + ",";
            } 
        }
        return primos;
    }
    
    //Método auxiliar.
    public boolean prim(int primo){
        for(int i=2;i<primo;i++){
            if(primo%i==0){
                return false;
            }
        }
        return true;
    }
    
    public boolean palabraInversa(String palabra){
        String formada = "";
        for(int i=0;i<palabra.length();i++){
            formada = palabra.charAt(i) + formada;
        }
        return formada.equalsIgnoreCase(palabra);
    }
}
