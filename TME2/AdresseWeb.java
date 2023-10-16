package TME2;

public class AdresseWeb {
    private String protocole , domaine , chemin;


    public AdresseWeb(String domaine) {
        this(domaine, "");
    }

    public AdresseWeb(String domaine, String chemin) {
     this("http" , domaine , chemin );
    }

        public AdresseWeb(String protocole, String domaine, String chemin) {
        this.protocole = protocole;
        this.domaine = domaine;
        this.chemin = chemin;
    }
  public String toString(){
    return protocole + "://www." +domaine+chemin;
  }

        
    
}
