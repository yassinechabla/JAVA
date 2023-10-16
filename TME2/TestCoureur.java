package TME2;

public class TestCoureur {
    public static void main(String[] args) {
        Coureur c1 = new Coureur();
        Coureur c2 = new Coureur();
        Coureur c3 = new Coureur();
        Coureur c4 = new Coureur();
        double tmp = 0.;
        for (int i = 0; i < 4; i++) {
            tmp += c1.getTempsAu100();
            c1.passeTemoin(c2);
            tmp+=c2.getTempsAu100();
            c2.passeTemoin(c3);
            tmp+=c3.getTempsAu100();
            c3.passeTemoin(c4);
            tmp+=c4.getTempsAu100();
            c4.passeTemoin(c1);
        }
    System.out.println("Temps total : " + tmp + " s");
    }
}
