
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException; 
 public class Pixel {
 private double x , y ;
 private boolean allume ;
 private int num;
    public Pixel (double x , double y , boolean allume , int num) {
    this.x = x ;
    this.y = y ;
    this.allume = allume ;
    this.num = num;
 }
 public Pixel(DataInputStream f)throws IOException{
      this.x = f.readDouble();
      this.y = f.readDouble();
      this.allume = f.readBoolean();
      this.num = f.readInt();
 }
    public String toString ( ) {
        return "["+num+" ("+x+" , "+y+") "+allume+"]" ;
 }


                    //Data : Haut niveau  //OutputStream : flux de sortie
 public void save(DataOutputStream f) throws IOException{
      f.writeDouble(x);
      f.writeDouble(y);
      f.writeBoolean(allume);
      f.writeInt(num);
 }
 }