package JAVA.TME1;

public class Segment {
    private int x ; 
    private int y;
    public Segment(int extX , int extY){
        x = extX ;
        y = extY;
    }
    public int longueur(){
        if (x>y)
            return x-y;
        else
        return y-x;
    }
    public String toString(){
        return "Segment " + "[<" + x + ">,<" + y + ">]"; 
    }

        public static void main(String [] args){
            Segment s1 =  new Segment(6,8);
            Segment s2 =  new Segment(12,5);
            if(s1.longueur()>s2.longueur()){
                System.out.println(s1.toString() + "est plus grand");
            }else if (s1.longueur()<s2.longueur()){
                System.out.println(s2.toString() + " est plus grand");
            }else{
                System.out.println("les deux segments sont égaux");
            }
        }
    
    
}
