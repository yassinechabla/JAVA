package TME7;

public class Vache extends AnimalAPattes {
    Vache(int age){
        super("Vache", age, 4);
    }

    public void crier(){
        System.out.println("Mooo ! Mooo!");
    }
    public double quantiteLait(){
        return Math.random() * 25 + 5;
    }
}
