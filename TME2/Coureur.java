package JAVA.TME2;

public class Coureur {
    private int numDossard;
    private double tempsAu100;
    private boolean possedeTemoin;
    public Coureur(int numDossard) {
        this.numDossard = numDossard;
        this.tempsAu100 = Math.random() * (4) + 12;
        this.possedeTemoin = true;
    }
    public Coureur(){
        this((int)(Math.random()*(1000)) + 1);
    }
    public int getNumDossard() {
        return numDossard;
    }
    public double getTempsAu100() {
        return tempsAu100;
    }
    public boolean isPossedeTemoin() {
        return possedeTemoin;
    }
    public void setNumDossard(int numDossard) {
        this.numDossard = numDossard;
    }
    public void setTempsAu100(double tempsAu100) {
        this.tempsAu100 = tempsAu100;
    }
    public void setPossedeTemoin(boolean possedeTemoin) {
        this.possedeTemoin = possedeTemoin;
    }
    
    public String toString() {
        String pr ="Non";
        if (possedeTemoin) pr = "Oui";
        return String.format("Coureur %d TempsAu100 : %.2fs au 100m possedeTemoin :%s ",numDossard , tempsAu100, pr);
    }
    public void passeTemoin(Coureur c) {
        if (this.possedeTemoin) {
            System.out.println("moi, coureur " + this.getNumDossard() + ", je passe le témoin au coureur " + c.getNumDossard());
            this.possedeTemoin = false;
            c.possedeTemoin=true;
        } else {
            System.out.println("Je n'ai pas le témoin à passer.");
        }
    }

    public void courir() {
        System.out.println("Je suis le coureur " + this.getNumDossard() + " et je cours.");
    }
}
