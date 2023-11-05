package TME7;

public abstract class AnimalSansPattes extends Animal {

    public AnimalSansPattes(String nom, int age) {
        super(nom, age);
    }
    public AnimalSansPattes(String nom){
        super(nom);
    }
    public String toString(){
        return super.toString() + " sans pattes";
    }
    
}
