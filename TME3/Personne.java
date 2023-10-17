package JAVA.TME3;

public class Personne {
    private String nom ;
    private Personne conjoint;  

    public Personne(String nom){
        this.nom  = nom;
        this.conjoint = null;
    }
    public Personne (){
        this("pers" + (char)((int)(Math.random()*26) + 'A'));

    }
    public String toString(){
  
        return nom + "," + (conjoint == null ? "célibataire" : "marié(e)"); 
    }

    void epouser(Personne p){
        if (this == p || p==null || this.conjoint!=null || p.conjoint !=null) {
            System.out.println("mariage impossible!");
        } else {
           System.out.println(this.nom + " célibataire se marie avec " + p.nom +", célibataire"); 
           this.conjoint = p;
           p.conjoint = this;
        }
    }
    void divorcer(){
        if(this.conjoint == null){
            System.out.println("Cette personne " + this.nom +" est célibataire , divorce impossible !");
        }else{
            System.out.println(this.nom + ", marié(e) divorce de " + conjoint.nom  +", marié(e)");
            this.conjoint.conjoint = null;
            this.conjoint = null;
            
        }
    }
    public static void main(String[] args) {
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        Personne p3 = new Personne();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        p1.epouser(p2);
        p1.epouser(p3);
        p3.epouser(p1);
        p3.epouser(p3);
        p1.divorcer();
        p3.divorcer();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }
}
