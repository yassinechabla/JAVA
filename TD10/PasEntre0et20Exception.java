package TD10;

public class PasEntre0et20Exception extends Exception {
    PasEntre0et20Exception(int note, String info){
        super("La note " + note + " est " + info);
    }
}
