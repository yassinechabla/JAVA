

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
 public static void main ( String [ ] args ) {
 Pixel p0 = new Pixel ( 0.0 , 0.0 , true , 1 ) ;
 Pixel p1 = new Pixel ( 4.2 , 11.38 , false , 2 ) ;
 Pixel p2 = new Pixel ( 6.6 , 4.51 , true , 3 ) ;

 System.out.println( "Création de "+p0 ) ;
 System.out.println( "Création de "+p1 ) ;
 System.out.println( "Création de "+p2+"\n") ;

 String nameRep = "/home/yassine/Studies/LU2IN002/JAVA/TME11/Exercice71/";
 DataOutputStream fOut = null ;
 DataInputStream fIn = null;
 try {
                                    //FileOutputStream : -File : fichier , OutputStream : flux de sortie 
    fOut = new DataOutputStream (new FileOutputStream( nameRep+"p0.bin")) ;
                                                      //ériture dans le fichier p0.bin
    p0.save( fOut ) ;
    p2.save( fOut ) ;
    p1.save( fOut ) ;
 } catch ( IOException e ) {
    System.err.println( " Erreur d'acces fichier : "+e ) ;
 }
 try {
    if ( fOut!= null )
        fOut.close( ) ;
 } catch ( IOException e ) {
    System.out.println( " Erreur de fermeture du fichier : "+e ) ;
 }
 try {

    fIn = new DataInputStream(new FileInputStream(nameRep + "pixels.bin"));
    Pixel p4 = new Pixel(fIn);
    Pixel p5 = new Pixel(fIn);
    Pixel p6 = new Pixel(fIn);
    System.out.println(p4 + " est lu");
    System.out.println(p5 + " est lu");
    System.out.println(p6 + " est lu");
 } catch (IOException e) {
    System.out.println("Erreur lors de l'ouverture de fichier " + e);
 }
 try {
   if (fIn!=null) {
      fIn.close();
   }
 } catch (IOException e) {
System.out.println("Erreur lors de la fermeture du fichier " + e ); }
   try {
      ArrayPixels arrayspixels = new ArrayPixels();
      arrayspixels.charge(nameRep + "pixels.bin");
   } catch (IOException e) {
      System.out.println("Erreur lors de l'ouverture de fichier " + e);
   }
 }
 
}