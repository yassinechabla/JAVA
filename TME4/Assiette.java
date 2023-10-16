package TME4;

public class Assiette{

    private int diametre;
    public Assiette(int n ){
        this.diametre = n;
    }
    public Assiette(){
        this(26);

    }
    public String toString(){
        return "Assiette " + diametre + " cm";
    }
}