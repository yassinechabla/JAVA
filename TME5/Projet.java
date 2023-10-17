package JAVA.TME5;

public class Projet {
    private Trio trio;
    private String nom;
    private static int cpt = 0;
    public Projet(String nom){
        this.nom = nom;
        this.trio = new Trio();
        cpt++;
    }
    public Projet(){
        this(Alea.chaine());
    }
    public String toString(){
        return "Projet " + this.nom + " " + this.trio.toString();
    }

    public static int getCpt() {
        return cpt;
    }
}
