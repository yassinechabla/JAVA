import java.util.ArrayList;

public class Etudiant {
    private static ArrayList<Etudiant> lEtudiants = new ArrayList<Etudiant>();
    private int[] tabNotes;
    private final int MAXNOTES = 5;
    private int nbNotes = 0 ;
    private String nom;
    public Etudiant(String nom){
        this.nom = nom;
        tabNotes = new int[MAXNOTES];
        lEtudiants.add(this);
    }

    public void entrerNote(int note) throws TabNotesPleinException{
            if (nbNotes<MAXNOTES) {
                tabNotes[nbNotes++] = note;
            }else{
                throw new TabNotesPleinException("le tableau de notes de l'étudiant " + this.nom + " est plein");
            }
    }

    public String toString() {
        String s=nom + " ";
        for (int i = 0; i < nbNotes; i++) {
                s+= " " + tabNotes[i]; 
        }
        return s;
    }
    public static String afficheListEtudiant(){
       return "les " + lEtudiants.size() + " étudiants :\n" + lEtudiants;

    }

}
