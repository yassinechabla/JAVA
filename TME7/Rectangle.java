package TME7;

public class Rectangle extends Figure2D{
    private double longueur , largeur;
    
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }


    public double perimetre() {
        return (this.longueur + this.largeur) * 2;
    }


    public double surface() {
        return this.longueur * this.largeur; 
    }
    
}
