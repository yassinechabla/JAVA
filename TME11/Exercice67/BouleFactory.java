

public class BouleFactory {
   public static final String[] couleurs={" rouge " , " jaune " , " bleue " , " verte " } ; //il faut que couleurs soit statique
   public static Boule build ( ) {
   return new Boule ( couleurs[(int)(Math.random( )*couleurs.length )] ) ; //erreur d'indice ni execution ni compilation
 }
}