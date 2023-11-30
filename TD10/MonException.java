package TD10;

    public class MonException extends Exception {
    public MonException(String s) {
        super(s);
        System.out.println("constructeur");
    }

}
