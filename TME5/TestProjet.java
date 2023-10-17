package JAVA.TME5;

public class TestProjet {
    public static void main(String[] args) {
        System.out.println(Personne.getNbPersonnes());
        Personne p1 = new Personne();
        Personne p2 = new Personne(); 
        System.out.println(p1); 
        System.out.println(p2); 
        System.out.println(Personne.getNbPersonnes());
    
        Projet pr1 = new Projet("P3X-774");
        Projet pr2 = new Projet("P3X-774");
         System.out.println(Personne.getNbPersonnes());
        System.out.println(pr1);
        System.out.println(pr2);
        Projet pr3 = new Projet();
        System.out.println(pr3 + "\n");

        System.out.println("Nombre de personnes créées : " + Personne.getNbPersonnes() + "\n");
        System.out.println("Nombre de personnes créés : " + Trio.getCompteur() + "\n");
        System.out.println("Nombre de projet créés : " + Projet.getCpt() + "\n");
       

    }
}
