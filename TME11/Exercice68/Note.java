package TME11.Exercice68;

public final class Note {
    // chaque note correspond à une fréquence
    public static final Note do_ = new Note(65.40);
    public static final Note re_ = new Note(73.41);
    public static final Note mi_ = new Note(82.40);
    public static final Note fa_ = new Note(87.30);
    public static final Note sol_ = new Note(97.99);
    public static final Note la_ = new Note(110);
    public static final Note si_ = new Note(123.471);
    public static final Note silence_ = new Note(0);

    // coefficient multiplicateur pour les demi-tons (dièse/bémol)
    public static final double demiTon = 1.05946;

    public final double frequence;

    private Note(double frequence) {
        this.frequence = frequence;
    }

    // pour générer les demi-tons
    public Note diese() {
        return new Note(frequence * demiTon);
    }

    public Note bemol() {
        return new Note(frequence / demiTon);
    }

    // pour passer dans une gamme au-dessus (facteur = nb de gammes au-dessus)
    public Note transpose(int facteur) {
        return new Note(Math.pow(2, facteur) * frequence);
    }

    //Q68.1
    //a-
    /*
     * 30->constructeur Note() est privé et ne peut pas être utilisé en dehors le la classe
     * 33->erreur lors de l'appel à la méthode bemol() 
     * 35->frequence est final
     * 38->multiplication impossible entre un double est une instance de Note / demiTon est aussi private
     * 39->transpose() ne prends pas de paramètre de type double
     */

     //b-
     /*Points faibles:
      *Le client ne peut pas accéder à la valeur de la fréquence vu qu'elle est private (il fallait la déclarer publique)
      *Le client ne peut pas créer d'autres notes de nos choix
      *Points forts:
      *le constructeur est déclaré private ainsi que toutes les variables sont déclarées final, dont le client ne pourra pas 
      *les modifier
      */
}
