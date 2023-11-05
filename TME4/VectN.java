package TME4;

import java.util.Arrays;

public class VectN {
    private int[] tab;

    private VectN(int n ){
        tab =  new int[n];
    }
    public VectN(int n , int valMax){
        this(n);
        for (int i = 0; i < n; i++) {
            tab[i] = (int)(Math.random()*( valMax +1));
        }
    }
    public VectN(){
        this(5, 9);
    }
    public VectN(int a , int b , int c ){
        tab =  new int[]{a , b , c};
    }

    public int somme(){
        int s = 0 ;
        for (int i : tab) {
            s+=i;
        }
        return s; 
    }

    public String toString(){
        String s ="[";
        for (int i = 0 ; i<tab.length ; i++) {
            
            s+= tab[i] ;
            if(i<tab.length -1) s+=", ";
        }
        return s+ "]";
    }

    public int[] getTab (){
        return Arrays.copyOf(tab, tab.length);
    }
    //non cela va exposer le tableau au client et il sera capable de le modifier 
    public static void main(String[] args) {
        VectN v = new VectN();
        System.out.println(v.toString());
    }

}
