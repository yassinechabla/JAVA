package TME1;

public class Lettre{
    private char carac ;
    public Lettre (char c){
        carac = c;
    } 
    public char getCharac(){return carac;}
    public int getCodeAscii(){
        return (int)carac;
    }

}