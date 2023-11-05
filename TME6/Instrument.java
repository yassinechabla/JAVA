package TME6;

public class Instrument {
    private int poids , prix;

    public Instrument(int poids, int prix) {
        this.poids = poids;
        this.prix = prix;
    } 
    public String toString(){
        return "poids : " + this.poids + " kg, prix : " + this.prix;
    }
    public void jouer(){
        System.out.println("L'instrument joue");
    }
}
