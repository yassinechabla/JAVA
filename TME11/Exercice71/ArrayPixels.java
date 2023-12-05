

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.IOException;

public class ArrayPixels {

private ArrayList<Pixel> l ;
public ArrayPixels() {
    l = new ArrayList<Pixel>() ;
    }
public void add(Pixel p) {
    l.add(p) ;
    }

    public void charge(String f) throws  IOException{
        l = new ArrayList<>();
        DataInputStream fIn = new DataInputStream(new FileInputStream(f));
        try {
            while (true) {
             l.add(new Pixel(fIn));    
            }
        } catch (EOFException e) {
            System.out.println("Nombre de pixels lu : " + l.size());
        }finally{
            if (fIn!=null) {
                fIn.close();
            }
        }

    }
public String toString ( ) {
    String res = "" ;
    for ( Pixel p : l ) {
    res += p.toString()+"\n" ;
    }
    return res;
    }
       
 }
