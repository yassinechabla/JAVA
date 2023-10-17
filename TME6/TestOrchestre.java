package JAVA.TME6;
public class TestOrchestre{
    public static void main(String[] args) {
        Piano piano = new Piano(300, 700, 88);
        Guitare guitare = new Guitare(2, 450, "classique");
        System.out.println(piano);
        System.out.println(guitare);

        System.out.println("\n");
        System.out.println("Création d'un orchestre : \n");

        Orchestre o = new Orchestre(7);
        o.ajouterInstrument(guitare);
        o.ajouterInstrument(piano);
        
        o.jouer();
    }
}