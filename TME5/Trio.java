package JAVA.TME5;

public class Trio {
    private Personne[] tab; 
    private static int compteur = 0;

    public Trio(){
        tab =  new Personne[3];
        tab[0] = new Personne();
        tab[1] = new Personne();
        tab[2] = new Personne();
        compteur++;
    }

    public String toString(){
        return "Trio " + compteur +  " : " + tab[0].toString() + " " + tab[1].toString()  + " " +  tab[2].toString();
    }

    public static void main(String[] args) {
        Trio t1 = new Trio();
        System.out.println(Personne.getNbPersonnes());
        System.out.println(t1.toString());
    }


    public static int getCompteur() {
        return compteur;
    }
}
