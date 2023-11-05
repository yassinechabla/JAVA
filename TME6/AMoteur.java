package TME6;
public class AMoteur extends Vehicule{

    private int capaciteReservoir , niveauEssence; 
    public AMoteur(String marque , int capaciteReservoir ){
        super(marque);
        this.niveauEssence = 0;
        this.capaciteReservoir = capaciteReservoir;
    }
    public String toString(){
        return super.toString() + " avec moteur ";
    }
    public void approvisionner(double nbLitres){
        if(this.niveauEssence + nbLitres <= this.capaciteReservoir) {
            this.niveauEssence+= nbLitres;
        }else{
            System.out.println("Réservoir plein, impossible d'approvisionner");
        }
    }

    public boolean enPanne(){
        return this.niveauEssence == 0;
    }
    
}