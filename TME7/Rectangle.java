package TME7;

public class Rectangle extends Figure2D{
    private double longueur , largeur;
    
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }


    public double perimetre() {
        return (longueur + largeur) * 2;
    }


    public double surface() {
        return longueur * largeur; 
    }


    @Override
    public String toString() {
        return "Rectangle : longueur=" + longueur + ", largeur=" + largeur + " surface=" + surface() + " périmètre=" + perimetre()  ;
    }
    
}
