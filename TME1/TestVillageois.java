package TME1;

public class TestVillageois {
    public static void main(String [] args){
        Villageois v1 = new Villageois("Hichem");
        Villageois v2 = new Villageois("Kader");
        Villageois v3 = new Villageois("Hamid");
        Villageois v4 = new Villageois("Walid");
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4.toString());
        double poidsTotal = v1.poidsSouleve() + v2.poidsSouleve() + v3.poidsSouleve() + v4.poidsSouleve();
        if (poidsTotal >= 100)
            System.out.println("ils peuvent");
        else System.out.println("Ils peuvent pas");

    }
}
