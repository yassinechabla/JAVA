package TME11.Exercice69;

 import java.io.File;

 public class TestLitRepertoire {
 public static void main ( String[] args ) {
    String nameF = "/home/yassine/Studies/LU2IN002" ;
    File f = new File (nameF) ;
    if( f.isDirectory()) {
    System.out.println(nameF + " est un répertoire, il contient : ") ;
    for ( File e : f.listFiles() ) {
        if (e.isDirectory())
            System.out.println("<repertoire>: "+e.getName());
        else
            System.out.println("<fichier>: "+e.getName() + "-taille: " + e.length() + "octets");
 }
 }
}
}
