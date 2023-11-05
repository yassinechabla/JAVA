package TME6;

public class Guitare extends Instrument{
    private String type;
    public Guitare (int poids , int pr , String type){
        super(poids, pr);
        this.type = type;
    }


    public String toString(){
        return "Guitare " + this.type +", "+  super.toString();
    }

    public void jouer(){
        System.out.println("La guitare " + this.type +  " joue");
    }
}