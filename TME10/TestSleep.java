import java.util.*;
public class TestSleep {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        try {
           System.out.print("Entrer un nombre de secondes : ");
           int x = scanner.nextInt(); 
           System.out.println("Attente de " + x + " secondes"); 
           Thread.sleep(x*1000);
           System.out.println("Fin de l'attente");
        } catch (InputMismatchException e) {
           System.out.println("Le nombre est mal formé");

        }finally{
            scanner.close();
        }
    }
    
}