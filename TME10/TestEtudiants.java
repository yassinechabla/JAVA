

public class TestEtudiants {

        public static void main(String[] args) {
            for (int i = 0; i < args.length; i++) {
                try {
                    System.out.println( Integer.parseInt(args[i]) + " est une note");
                } catch (NumberFormatException e) {
                    System.out.println( args[i] + " est un nom"); 
                }
            }
        }
}