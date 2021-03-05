/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prypracticas;

import java.util.ArrayList;

/**
 *
 * @author unemi
 */
public class Objetos {

    private ArrayList  Lista;

    public Objetos() {
        this.Lista = new ArrayList();
    }

    public void ingresar(Object p) {
        Lista.add(p);
    }

    public void subIndice(int p, Object u) {
        Lista.set(p, u);
    }
    public void Persona(){
    for(Object P:Lista){
        System.out.println(P);
    
    }}
  
public void Verificar(Object o){
    for (int i = 0; i < Lista.size(); i++) {
        if(o==Lista.get(i)){
            System.out.println(i+"El valor esta en la lista\n"+Lista.get(i));}
    }
}
public void numerodelista(){
    for (int i = 0; i < 10; i++) {
           System.out.println(i+"\n"+Lista.get(i));
    }
}
    
}
