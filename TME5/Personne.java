package TME5;

public class Personne {
    private String nom; 
    private static int nbPersonnes = 0;
    private static char lettre = 'A';
    public Personne(){
        this.nom = "Individu" + lettre;
        lettre++;
        nbPersonnes++;
    }
    public String getNom() {
        return nom;
    }
    public static int getNbPersonnes() {
        return nbPersonnes;
    }
    public String toString(){
        return this.nom;
    }
}
