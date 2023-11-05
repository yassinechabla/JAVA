package TME3;

public class TestTracteur {
    public static void main(String[] args) {
        Roue r1 = new Roue(120);
        Roue r2 = new Roue(120);
        Roue r3 = new Roue();
        Roue r4 = new Roue();
        Cabine c = new Cabine(3, "bleue");
        Tracteur t1 = new Tracteur(c, r1, r2, r3, r4);
        // Tracteur t2 = t1; // t2 et t1 ont une meme reference vers une seule cabine 
        //il faut faire en sorte que la reference vers la cabine du tracteur t2 soit différente de la 
        //réfrence vers la cabine du tracteur t1
        Tracteur t2 = new Tracteur(new Cabine(3, "rouge"), r1, r2, r3, r4);
        t2.peindre("bleue");
        System.out.println(t1);
        System.out.println(t2);

    }
}
