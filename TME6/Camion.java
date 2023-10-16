package TME6;

public class Camion extends AMoteur{
    private int volume; 
    public Camion(String marque , int capaciteReservoir , int volume){
        super(marque, capaciteReservoir);
        this.volume = volume;
    }
    public String toString(){
        return "Camion " + super.toString() + ", volume = " + this.volume;
    }
    public void transporter(String materiau , int km){
        if(super.enPanne()){
            System.out.println("Le camion " + this.id + " n'a plus d'essence !");
        }else{
            this.distance+=km;
            System.out.println("Le camion " + this.id + " a transporté des " + materiau  + " sur " + km + "km" );
        }
    }

}
