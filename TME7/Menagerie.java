package TME7;


public class Menagerie {
    private Animal[] tab;
    private int nbAnimal; 
    public static int compteur =0;
    public Menagerie(int maxTaille){
        tab = new Animal[maxTaille];
        compteur++;
    }
    public void ajouter(Animal a){
        if(nbAnimal<tab.length){
            tab[nbAnimal] = a;
            nbAnimal++;
            System.out.println(a.toString() + " ajouté à la ménagerie !, nombre total d'animaux : " + nbAnimal );
        }else{
            System.out.println("Ménagerie pleine" + nbAnimal);
        }
    }
    public void midi(){
       for (int i = 0; i < tab.length; i++) {
            
                tab[i].crier();
            
}
    }
    public void vieillirTous(){
        for (Animal animal : tab) {
            animal.vieillir();
        }
    }
        public String toString() {
            String s ="";
            for (Animal animal : tab) {
                s+= animal.toString() + ", ";
            }
        return s;
    }
    public static void main(String[] args) {
        Menagerie m = new Menagerie(3);
        m.ajouter(new Vache(1));
        m.ajouter(new Boa("Boa",1));
        m.ajouter(new Boa("Sarah",20));
        m.midi();
        m.vieillirTous();
        System.out.println(m.toString());
        
        
    }

}