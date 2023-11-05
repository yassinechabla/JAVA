package TME4;

public class TestPile {
    public static void main(String[] args) {
        Pile p1 = new Pile(3);
        Assiette a1 = new Assiette(45);
        Assiette a2 = new Assiette(50);
        Assiette a3 = new Assiette();

        
        p1.empiler(a1);
        System.out.println(p1);
        p1.empiler(a2);
        System.out.println(p1);
        p1.empiler(a3);
        System.out.println(p1);
        p1.depiler();
        System.out.println(p1);
        p1.empiler(a3);
        System.out.println(p1);
        p1.empiler(a2);
        System.out.println(p1);
        p1.depiler();
        System.out.println(p1);
        p1.depiler();
        System.out.println(p1);
        p1.depiler();
        System.out.println(p1);
        p1.depiler();
        System.out.println(p1);

        
    }
}
