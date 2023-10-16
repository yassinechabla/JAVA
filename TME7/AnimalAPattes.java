package TME7;

public abstract class AnimalAPattes extends Animal{
    private int nbPattes; 
    public AnimalAPattes(String nom, int age , int nbPattes) {
        super(nom, age);
        this.nbPattes = nbPattes;
       
    }
    public String toString(){
        return super.toString() + " nombre de pattes = " + this.nbPattes;
    }
    
}
