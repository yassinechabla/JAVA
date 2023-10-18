package JAVA.TME6;

public class Voiture extends AMoteur{
    private int nbPlaces; 
    public Voiture(String marque,int capaciteReservoir, int nbPlaces){
        super(marque, capaciteReservoir);
        this.nbPlaces = nbPlaces;
    }
    public void transporter(int nbPers , int km){
        if(nbPers>this.nbPlaces){
            System.out.println(String.format("La voiture prend %d places et vous êtes à %d !",this.nbPlaces ,nbPers));
        }else if(super.enPanne()){
            System.out.println("La voiture " + this.id + " n'a plus d'essence !");
        }else{
            super.distance+=km;
            System.out.println("La voiture " + this.id + " transporte " + nbPers + " personnes sur " + km + "km" );
        }
    }
    public String toString(){
        return "Voiture " + super.toString() + " et nombre de places = " + nbPlaces;
    }

}
