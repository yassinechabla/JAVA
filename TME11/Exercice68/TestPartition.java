package TME11.Exercice68;

public class TestPartition {
    public static void main(String[] args) {
        // Création de notes
        Note do_ = Note.do_;
        Note re_ = Note.re_;
        Note mi_ = Note.mi_;

        // Création d'une partition avec tempo 120
        Partition partition = new Partition(120.0);

        // Ajout de trois notes à la partition
        partition.ajouterRythme(new Noire(do_));
        partition.ajouterRythme(new Noire(re_));
        partition.ajouterRythme(new Noire(mi_));

        // Création d'un traducteur pour la partition
        Traducteur traducteur = new Traducteur(partition);

        // Affichage des triplés dans la console
       System.out.println( traducteur);
    }
}

