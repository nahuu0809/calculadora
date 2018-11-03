
package javaapplication15;

import java.util.ArrayList;

public class Integer {
    
    protected int n1;
    protected int n2;
    protected int n3;
    protected int n4;
    protected int n5;
    protected int n6;
    protected int n7;
    protected int n8;
    protected int n9;
    protected int n10;

    public Integer(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        this.n1 = 1;
        this.n2 = 2;
        this.n3 = 3;
        this.n4 = 4;
        this.n5 = 5;
        this.n6 = 6;
        this.n7 = 7;
        this.n8 = 8;
        this.n9 = 9;
        this.n10 = 10;
    }
    
     funcion quitarImpares(Lista<Integer> numeros) {
     for(int indice=0; indice < numeros.size(); indice++) {
           if(numeros.get(indice) % 2 != 0) {
               numeros.remove(indice);    
           }
      }
        return null;
}  
    
}
