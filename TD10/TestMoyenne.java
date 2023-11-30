package TD10;

public class TestMoyenne {
     public static int moyenne ( String [ ] tab ) throws ANEException{
         int note , somme=0, n=0;
         for ( int i =0; i<tab.length ; i++) {
        try {
         note=Integer.parseInt( tab [ i ] ) ;
         if (note>20) {
            throw new PasEntre0et20Exception(note, ">20");
         }
         if (note<0) {
            throw new PasEntre0et20Exception(note, "est négative");
         }
         somme=somme+note ;
         n=n+1;
        } catch (NumberFormatException e) {
            System.out.println("Note " + tab[i] + "pas entière");
        }catch(PasEntre0et20Exception e){
            System.out.println(e.getMessage());
        }
         }
         if (n==0) throw new ANEException();
         return somme/n;
         }
    public static void main(String[] args) {
        try {
            System.out.println("Moyenne : "  + moyenne(args));
        } catch (ANEException e) {
            System.out.println(e.getMessage());
        }
        }
    }

