package TME6;

public class Velo extends SansMoteur{
    private int nbVitesses ;
    public Velo(String marque  , int nbVitesses){
    super(marque);
        this.nbVitesses = nbVitesses; 
    }

    public String toString(){
        return "Vélo " + super.toString() + this.nbVitesses + " vitesses";
    }
     
     

}
