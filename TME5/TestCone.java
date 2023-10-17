package JAVA.TME5;

public class TestCone {
    public static void main(String[] args) {
        System.out.println(Cone.getNbCones());
        Cone c1 = new Cone();
        Cone c2 =  new Cone(2.4, 8);
        System.out.println(Cone.getNbCones()); 
    }
}
