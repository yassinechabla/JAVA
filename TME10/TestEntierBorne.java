package JAVA.TME10;

public class TestEntierBorne {
    public static void main(String[] args) {
        try{
            EntierBorne ebX = new EntierBorne((int)(Math.random()*301 -150));
            EntierBorne ebY = new EntierBorne((int)(Math.random()*3));
            System.out.println("Valeur de X : " + ebX);
            System.out.println("Valeur de Y : " + ebY);
            System.out.println("La valeur de leurs somme est : " + ebX.somme(ebY));
            System.out.println("Résultat de la division de X par Y : " + ebX.divPar(ebY));
        }catch(EntierBornesException e){
            System.out.println(e.getMessage());
        }catch(DivisionParZeroException e){
            System.out.println(e.getMessage());
        }
    }
}
