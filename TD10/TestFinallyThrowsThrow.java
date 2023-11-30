package TD10;


public class TestFinallyThrowsThrow {

    public static void test1() throws MonException {
        if (true) throw new MonException("lancée dans test1");
        System.out.println("test1 : fin méthode");
    }

    public static void test2() {
        try {
            if (true) throw new MonException("lancée dans test2");
        } catch (MonException e) {
            System.out.println("test2 : capture exception : " + e);
        }
        System.out.println("test2 : fin méthode");
    }

    public static void test3() {
        try {
            if (true) throw new MonException("lancée dans test3");
        } catch (MonException e) {
            System.out.println("test3 : capture exception : " + e);
        } finally {
            System.out.println("test3 : finally effectué");
        }
        System.out.println("test3 : fin méthode");
    }

    public static void test4() throws MonException {
        try {
            if (true) throw new MonException("lancée dans test4");
        } finally {
            System.out.println("test4 : finally effectué");
        }
        System.out.println("test4 : fin méthode");
    }

    public static void test5() throws MonException {
        try {
            if (false) throw new MonException("lancée dans test5");
        } finally {
            System.out.println("test5 : finally effectué");
        }
        System.out.println("test5 : fin méthode");
    }

    public static void main(String[] args) {
        try {
            test1();
        } catch (MonException e) {
            System.out.println("main : test1 : capture exception " + e);
        }
        test2();
        test3();
        try {
            test4();
        } catch (MonException e) {
            System.out.println("main : test4 : capture exception " + e);
        }
        try {
            test5();
        } catch (MonException e) {
            System.out.println("main : test5 : capture exception " + e);
        }
        System.out.println("Fin du programme");
    }
}

