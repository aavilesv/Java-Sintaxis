/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

/**
 *
 * @author unemi
 */
public class operacion {
    private int numero1;
    private int numero2;
    public operacion()
    {
        numero1=0;
        numero2=0;
        
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
     public int suma(int n1, int n2)
    {
    int sumanumero=n1+n2;
    return sumanumero;
    }
    
}
