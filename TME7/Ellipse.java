package JAVA.TME7;

public class Ellipse  extends Figure2D{
    private double longueura , longueurb;

    public Ellipse(double longueura, double longueurb) {
        this.longueura = longueura;
        this.longueurb = longueurb;
    }
    public double perimetre() {
        return 2*Math.PI * Math.sqrt((longueura*longueura + longueurb*longueurb)/2);
    }


    public double surface() {
        return Math.PI * longueura * longueurb; 
    }
    @Override
    public String toString() {
        return "Ellipse : longueur=" + longueura + ", largeur=" + longueurb + " surface=" + surface() + " périmètre=" + perimetre()  ;
    }
    
}
