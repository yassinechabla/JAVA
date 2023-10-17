package JAVA.TME10;

public class EntierBorne {
    private int valeur ;
    private static final int MAX=100;
    private static final int MIN=-100;
    public EntierBorne(int n ) throws EntierBornesException{
        if (n>MAX) {
            throw new EntierBornesException("Entier trop grand : " + n);
        }
        if (n<MIN) {
           throw new EntierBornesException("Entier trop petit : " + n); 
        }
        valeur=n;
    }
    public String toString(){
        return "Valeur = " + valeur;
    }
    public EntierBorne somme(EntierBorne eb)throws EntierBornesException{
        return new EntierBorne(valeur + eb.valeur);
    }
    public EntierBorne divPar(EntierBorne eb)throws DivisionParZeroException, EntierBornesException{
        if (eb.valeur == 0){
            throw new EntierBornesException("division par zero");
        }else{
            return new EntierBorne(valeur / eb.valeur);
        }
    }
}
