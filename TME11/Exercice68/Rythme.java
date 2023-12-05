package TME11.Exercice68;

//Dans un point de vue conceptionnel, un rythme ne peut pas hériter de la classe Note, vu qu'il contiendra une 
//Note mais lui même n'est pas une Note, ainsi que dans notre cas, la class Note est final donc c'est impossible de l'hériter
public abstract class Rythme {
    protected Note note;
    private double duree;
   
    public Rythme(Note note, double duree) {
        this.note = note;
        this.duree = duree;
    }
    public double getFrequence(){
        return note.frequence;
    }  
    public double getDuree() {
        return duree;
    }

    
}
