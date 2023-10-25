package JAVA.TME7;

public class Vache extends AnimalAPattes {
    private double quantiteLait;
    public  Vache(int age , String nom){
        super(age, nom,4);
        quantiteLait = Math.random()*(25) + 5;
    }
    public Vache(String nom){
        super(nom, 4);
        quantiteLait = Math.random()*(25) + 5;
    }
    public void crier(){
        System.out.println("Mooo ! Mooo!");
    }
    public String toString(){
        return super.toString() + " c'est une vache et elle produit : " + quantiteLait + " litres de lait";
    }
}
