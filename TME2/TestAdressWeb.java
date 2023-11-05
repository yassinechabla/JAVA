package TME2;

public class TestAdressWeb {
    public static void main(String[] args) {
        AdresseWeb adr1 = new AdresseWeb("Flame.com");
        AdresseWeb adr2 = new AdresseWeb("Flame.com" , "/dir/page1.html");
        AdresseWeb adr3 = new AdresseWeb("https" ,"Flame.com", "/dir/page1.html");
        System.out.println(adr1);
        System.out.println(adr2);
        System.out.println(adr3);
    }
}
