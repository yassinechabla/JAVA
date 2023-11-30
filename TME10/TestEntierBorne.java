public class TestEntierBorne {
    public static void main(String[] args) {
        try {
            EntierBorne ebX = new EntierBorne((int)(Math.random()*301)  -150);
            EntierBorne ebY = new EntierBorne((int)(Math.random()*3));
            System.out.println(ebX);
            System.out.println(ebY);
            System.out.println("Somme : " + ebX.somme(ebY)); 
            System.out.println("Division : " + ebX.divPar(ebY));   
        } catch (HorsBornesException e) {
            System.out.println(e.getMessage());
        }catch(DivisionParZeroException e){
            System.out.println(e.getMessage());
        }
    }
}
