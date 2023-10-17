package JAVA.TME8;

public class Champignon implements Ramassable {
    private String nom ;
    private double poids ;
    public Champignon(String nom){
        this.nom = nom; 
        this.poids= Math.random()*(3); 
    }

    public double getPoids() {
        return poids;
    }

    public String toString(){
        return String.format( nom + " %.1f kg", poids);
    }

    

}
