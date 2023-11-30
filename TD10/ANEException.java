package TD10;

public class ANEException extends Exception {
        public ANEException(){
            super("Aucune note entière");
        }
        public ANEException(String msg){
            super(msg);
        }
}
