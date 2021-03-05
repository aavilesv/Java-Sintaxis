
package tarea2;

/**
 *
 * @author Kleyner
 */
public class Calculo {
    private int numero1;
    private int numero2;
    private String palabra;
    
    public Calculo(){
        this.numero1=0;
        this.numero2=0;
        this.palabra=" ";
    }
    
    public Calculo(int num1, int num2, String palabra){
        this.numero1=num1;
        this.numero2=num2;
        this.palabra=palabra;
    }
    
    public void setNumero1(int num1){
        this.numero1= num1;
    }
    public int getNumero1(){
        return numero1;
    }
    
    public void setNumero2(int num2){
        this.numero2= num2;
    }
    public int getnumero2(){
        return numero2;
    }
    
    public void setPalabra(String palabra){
        this.palabra= palabra;
    }
    public String getPalabra(){
        return palabra;
    }
    
    public String presentarRango(int numInic, int numFin){
        String ran="";
        int cont;
        cont= numFin+1;
        do{
            ran += Integer.toString(cont);
            if(!(cont == numInic-1)){
                ran += ",";
            }
            cont++;
        }while(cont < numInic);
        return ran ;
    }
    
    public String primosImpares(String rango){
        String primos="";
        int num;
        boolean com;
        String Vect[] = rango.split(",");
        for (String Vect1 : Vect) {
            com = false;
            num = Integer.parseInt(Vect1);
            for(int j=2; j<num; j++){
                if(num%j==0){
                    com=true;
                    break;
                }
            }
            if(com==false){
                primos+= Integer.toString(num);
            }
        }
        return primos;
    }
    
    public boolean palabraInversa(String palabra){
        String pal="";
        for(int i =(palabra.length()-1); i>=0;i--){
            pal+= palabra.charAt(i);
            
        }
    return !pal.equalsIgnoreCase(palabra);
    }
}
