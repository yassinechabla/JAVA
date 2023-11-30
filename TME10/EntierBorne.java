public class EntierBorne {
    public static final int MAX =100;
    public static final int MIN =-100;
    private int valeur;
    public EntierBorne(int valeur)throws HorsBornesException{
        if (valeur>MAX) {
            throw new HorsBornesException("Entier trop grand :" + valeur);
        }
        if (valeur<MIN) {
             throw new HorsBornesException("Entier trop petit :" + valeur);
        }
        this.valeur = valeur;
    }

    public String toString() {

        return Integer.toString(valeur);
    }

    public EntierBorne somme(EntierBorne eb)throws HorsBornesException{
        return new EntierBorne(valeur+eb.valeur);
    }
    public EntierBorne divPar(EntierBorne eb) throws HorsBornesException,DivisionParZeroException{
        if (eb.valeur==0) {
            throw new DivisionParZeroException();
        }
        return new EntierBorne(valeur/eb.valeur);
    }
}
