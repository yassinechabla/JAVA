package TME7;


public class Menagerie {
    private Animal[] tab;
    private static int nbAnimal =0;
    public Menagerie(int maxTaille){
        tab = new Animal[maxTaille];
    }
    public void ajouter(Animal a){
        if(nbAnimal<tab.length){
            tab[nbAnimal] = a;
            nbAnimal++;
            System.out.println(a.nom + " ajouté à la ménagerie !, nombre total d'animaux : " + nbAnimal );
        }else{
            System.out.println("Ménagerie pleine nombre maximaum est : " + nbAnimal + " animaux");
        }
    }
    public void midi(){
       for (int i = 0; i < tab.length; i++) {
            
                tab[i].crier();
            
}
    }
    public void vieillirTous(){
        for (Animal animal : tab) {
            if(animal!=null)
            animal.vieillir();
        }
    }
        public String toString() {
            String s ="";
            for (Animal animal : tab) {
                if (animal!=null)
                s+= animal.toString() + "\n";
            }
        return s;
    }
    public static void main(String[] args) {
        Menagerie m1 = new Menagerie(4);
        Vache v1 = new Vache(2, "Aicha");
        Vache v2 = new Vache("Aghilas");
        Boa b1 = new Boa("Nesrine");
        Boa b2 = new Boa(3, "Sarah");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Ajout d'animaux");
        System.out.println("---------------------------------------------------------------------------------------");
        
        m1.ajouter(v1);
        m1.ajouter(v2);
        m1.ajouter(b1);
        m1.ajouter(b2);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Quand la ménagerie est pleine : ");
        System.out.println("---------------------------------------------------------------------------------------");
        m1.ajouter(b2);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Affichage de tous les animaux de la ménagerie");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(m1);
        
    }

}