package TME8;

public class TestForet {
    public static void main(String[] args) {
        Foret foret = new Foret(12);
        for (int i = 0; i < 10; i++) {
            if(Math.random()<0.3){
            foret.placer(new Arbre("Pins"));}else{
            foret.placer(new Champignon("Cèpe"));
            }
        }
        Panier p =  new Panier(1000);
        p.add( new Walid("Pinaza"));
       //foret.ramasser(p);
       //foret.placer(new ChampignonToxique("Amanites"));
       //foret.placer(new ChampignonToxique("Amanites"));
       //System.out.println(p);
       //System.out.println(p.compterToxique());

       System.out.println(foret.toString());
       foret.ramasser(p);
        //System.out.println();
        //System.out.println(foret);
        //System.out.println(foret.toString());
    }
}
