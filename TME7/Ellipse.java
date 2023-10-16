package TME7;

public class Ellipse  extends Figure2D{
    private double longueura , longueurb;

    public Ellipse(double longueura, double longueurb) {
        this.longueura = longueura;
        this.longueurb = longueurb;
    }
    public double perimetre() {
        return 2*Math.PI * Math.sqrt((this.longueura*this.longueura + this.longueurb*this.longueurb)/2);
    }


    public double surface() {
        return Math.PI * this.longueura * this.longueurb; 
    }
    
}
