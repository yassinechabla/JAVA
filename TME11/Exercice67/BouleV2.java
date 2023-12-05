

 public class BouleV2 {
    private String couleur ;
    public final static BouleV2 ROUGE = new BouleV2 ( " rouge " ) ;
    public final static BouleV2 JAUNE = new BouleV2 ( " jaune " ) ;
    public final static BouleV2 BLEUE = new BouleV2 ( " bleue " ) ;
    public final static BouleV2 VERTE = new BouleV2 ( " verte " ) ;

    private BouleV2 ( String couleur ) {
    this.couleur = couleur ;
    }
    @Override
    public String toString() {

        return couleur ;
    }
 }
