package JAVA.TME1;

public class TestLettre {
public static void main(String[] args) {
   for (char a = 'a' ; a<='z' ; a++){
    Lettre l = new Lettre(a) ; 
    System.out.println(l.getCodeAscii());
   }
   int cpt =1;
   for(char a = 'a' ; a<='z' ; a++){
    Lettre l = new Lettre(a) ;
    if(cpt%5 ==0) System.out.println(l.getCharac() );
    else System.out.print(l.getCharac()+ " ");
    cpt++;
}
}}
