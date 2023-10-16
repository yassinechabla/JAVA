package TME1;

public class Villageois {
    private String nom ; 
    private double poids;
    private boolean malade;
    public Villageois(String nomVillageois){
        nom = nomVillageois;
        poids = Math.random() * (100) + 50 ;
        malade = Math.random()< 0.2;
    }
    public String toString(){
        String rp = "Non";
        if (malade) rp = "Oui"; 
        return String.format("villageois :  %s   %.2f kg, malade :  %s, peut soulever %.1f  ", nom , poids , rp ,poidsSouleve()) ; 
    }
    public String getNom(){
        return nom; 
    }
    public double getPoids(){
        return poids; 
    }
    public boolean getMalade(){
        return malade;
    }
    public double poidsSouleve(){
        if (malade) return poids /4;
        return poids / 3;
    }
}

