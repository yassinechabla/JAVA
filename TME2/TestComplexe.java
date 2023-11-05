package TME2;

public class TestComplexe {
    public static void main(String[] args) {
        Complexe c1 = new Complexe(1.5, 4);
        Complexe c2 = new Complexe(1.5, 0);
        Complexe c3 = new Complexe(0, 1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1.estReel());
        System.out.println(c2.estReel());
        System.out.println(c3.estReel());

       Complexe c4 =  c3.multiplication(c3);
       System.out.println(c4);
       

        
    }
    
}
