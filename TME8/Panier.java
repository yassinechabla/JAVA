package TME8;

import java.util.ArrayList;

public class Panier extends ArrayList<Ramassable> {
    private  double poidsMax;
    public Panier(double poidsMax){
        this.poidsMax = poidsMax;
    }
    public double getPoids(){
        double sum = 0 ;
        for (Ramassable obj : this) {
           sum+= obj.getPoids() ;
        }
        return sum;
    }
        public double getPoidsMax(){
        return poidsMax;
    }

    @Override
    public boolean add(Ramassable e){
        if (this.poidsMax >= (this.getPoids())+ e.getPoids()){
            super.add(e);
            return true;
        }else{
            return false;
        }
    }
    public int compterToxique(){
            int cpt = 0 ;
            for (Ramassable obj : this) {
            if(obj instanceof Toxique)
            cpt++;
        }
        return cpt ; 
    }
    public String toString() {
        int nombreToxiques = compterToxique();
        return "Panier contenant " + size() + " objets, dont " + nombreToxiques + " toxiques (" + getPoids() + "kg sur " + poidsMax + "kg)";
    }
}
