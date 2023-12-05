package TME11.Exercice68;
import java.util.ArrayList;
public class Partition extends ArrayList<Rythme> {
    private double tempo;
    public Partition(double tempo){
        this.tempo = tempo;
    }
    public void ajouterRythme(Rythme r){
         this.add(r);
    }
    public Rythme getNote(int i){

        return this.get(i);
    }
    public double getTempo() {
        return tempo;
    }
}
