package JAVA.TME4;

public class Pile {
    private Assiette[] tab ; 
    private int nbA = 0;
    public Pile(int tailleMax){
        tab = new Assiette[tailleMax];
    } 

    public boolean estVide(){
        return nbA == 0;
    }
    public boolean estPleine(){
        return nbA == tab.length;
    }
    public void empiler(Assiette a){
        if(!estPleine()){
         System.out.print("On empile : " + a.toString() + "\n");
         tab[nbA] = a;
         nbA++;
        }else{
            System.out.println("La pile est pleine, impossible d'empiler! \n");
        }
    }
    public Assiette depiler(){
        if(!estVide()){
            nbA--;
            Assiette assiette = tab[nbA];
            tab[nbA ]  = null;
            System.out.println("On dépile : " + assiette.toString() + "\n");
           return assiette;
        }
        System.out.println("La pile est vide \n");
        return null;       
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nbA; i++) {
            sb.append(tab[i]).append("\n");
        }
        return sb.toString();
    }

}
