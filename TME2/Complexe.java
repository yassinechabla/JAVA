package TME2;

public class Complexe {
    private double reelle , imag;

    public Complexe(double reelle, double imag) {
        this.reelle = reelle;
        this.imag = imag;
    }
    public Complexe addition(Complexe c){
        return new Complexe(this.reelle + c.reelle, this.imag+c.imag);
    }
    public Complexe multiplication(Complexe c){
        return new Complexe(this.reelle*c.reelle - this.imag*c.imag , this.reelle*c.imag + c.reelle*this.reelle);
    }
    public String toString(){
        if(reelle == 0){
            if (imag == 1){
                return "i";

            }else{
                return String.format("%.0fi",imag);
            }
        }else {
            if(imag ==0){
                return String.format("%.0f",reelle);
            }else{
                return String.format("%.1f + %.0fi", reelle ,imag);
            }
        }
    } 
    

        public boolean estReel(){
        return imag == 0 ;
    }
    
}
