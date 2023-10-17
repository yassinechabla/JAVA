package JAVA.TME6;

public class Vehicule {
    private static int compteur = 0;
    protected  int  id ;
    private String marque ;
    protected double distance;



    public Vehicule(String marque){
        this.marque = marque;
        this.distance = 0;
        compteur++;
        this.id = compteur;
    }

    public String toString(){
        return this.id + " de marque " + this.marque; 
    }
    public void rouler(double distance){
        this.distance+=distance;
        System.out.println(String.format(this.toString() + " a roulé %.1f km ", distance));
    }
}
