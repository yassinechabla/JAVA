package JAVA.TME7;

public abstract class Animal {
    protected String nom; 
    private int age ;
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    } 
    public Animal(String nom){
        this(nom, 1);
    }
    public String toString(){
        return "Animal : " + this.nom + " age : " + this.age; 
    }

    public void vieillir(){
        this.age++;
    }
    public abstract void crier();
}
