package JAVA.TME7;
public abstract class AnimalAPattes extends Animal{
    private int nbPattes; 
    public AnimalAPattes( int age ,String nom, int nbPattes) {
        super(nom, age);
        this.nbPattes = nbPattes;
       
    }
    public AnimalAPattes(String nom, int nbPattes){
        super(nom);
        this.nbPattes=nbPattes;
    }
    public String toString(){
        return super.toString() + " nombre de pattes = " + this.nbPattes;
    }
    
}
