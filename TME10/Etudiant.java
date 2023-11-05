package TME10;

import java.util.ArrayList;

public class Etudiant {
    public static ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
    private String nom; 
    private int index =0;
    private int[] notes; 
    public Etudiant(String nom){
        this.nom = nom;
        notes = new int[5];
    }
    public String toString(){
        String s="Nom : \n";
        s+=(nom);
        s+="\n Notes : \n";
        for (int i : notes) {
            s+= " " + i;
        }
        return s;
}

    public void entrerNote(int note) throws TabNotesPleinException{
        if (notes.length == 5){
            throw new TabNotesPleinException("Tableau plein");
        }else{
            notes[index] = note;
            index++;
        }
    }

}
