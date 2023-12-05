package TME11.Exercice68;

public class Traducteur implements Iterator {
    private Partition partition;
    private double temps = 0;
    public Traducteur(Partition partition){
        this.partition = partition;

    }
    public boolean hasNext() {
        return !partition.isEmpty();
    }

    public double[] next() {
         if (hasNext()) {
            Rythme r = partition.remove(0);
            double[] triplet = {temps,(r.getDuree()*partition.getTempo())/60,r.note.frequence};
            temps += (r.getDuree()*partition.getTempo())/60;
            return triplet;
         }
        return null;
    }

    public String toString() {
        StringBuilder s = new StringBuilder(); //On a trop de concaténations si la partition contient beaucoup de notes 
                                               //donc il vaut mieu d'utiliser un StringBuilder
        while (hasNext()) {
            double[] triplet = next();
            s.append("Temps actuel: " + triplet[0] + ", Durée: " + triplet[1] + ", Fréquence: " + triplet[2] + "\n");
        }    
        return s.toString();
    }
    
}
