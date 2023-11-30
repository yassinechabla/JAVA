package TD10;

public class Balance{
private static final int MAX=150;
public void peser(int poids) throws TropLourdException{
    if(poids>=MAX){
        throw new TropLourdException();
    }
    System.out.println("Poids : "+poids+" kg");
}
}
