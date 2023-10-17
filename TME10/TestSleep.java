package JAVA.TME10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestSleep {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre de secondes : ");
        try{
            int x =  scanner.nextInt();
            scanner.close();
            System.out.println("Attente de " + x + " secondes\n");
            Thread.sleep(x*1000);
            System.out.println("Fin de l'attente\n");
        }catch(InputMismatchException e){
            System.out.println("Le nombre est mal formé \n");
        }
    }
}
