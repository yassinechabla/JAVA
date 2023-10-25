package JAVA.TME7;

public class Boa extends AnimalSansPattes{
    public Boa (int age,String nom ){
        super(nom, age);
    }
    public Boa(String nom){
        super(nom);
    }
    public String toString(){
        return super.toString() + " c'est une Boa";
    }
    public void crier() {
        System.out.println("Sssssss! Ssssss!");
    }
    
}
