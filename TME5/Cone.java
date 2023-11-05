package TME5;

public class Cone {
    private double r , h;
    private static double PI = 3.14159; 
    private static int nbCones =0;
    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
        nbCones++;
    }  
    public Cone(){
        this((int)Math.random()*10 ,(int)Math.random()*10 );    }

    public double getVolume(){
          return (1/3) * PI * this.r * this.r * this.h;
    }

    public String toString(){
        return String.format("Cone r=%.1f h=%.1f V=%.6f", r , h ,getVolume());
    }
    public static int getNbCones(){
        return nbCones;
    }
}
