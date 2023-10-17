package JAVA.TME6;

public class Piano extends Instrument {
    private int nbTouches ; 
    public Piano (int po , int pr, int nb){
        super(po, pr);
        this.nbTouches = nb;
    }
    public String toString(){
        return "Piano " + this.nbTouches +" touches, "+ super.toString();
    } 
    
    public void jouer(){
        System.out.println("Le piano joue");
    }
}
