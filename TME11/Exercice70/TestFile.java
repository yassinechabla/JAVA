import java.io.File;
import java.io.IOException;

public class TestFile {

   public static String pwd() {
      File f = new File("");
      return f.getAbsolutePath();
   }

   public static String ls(File f) {
      if (!f.exists()) {
         return "No such directory";
      }
       else {
         StringBuilder s = new StringBuilder();
         for (File file : f.listFiles()) {
            if (file.isFile())
            s.append(file.getName() + "\n");
         }
         return s.toString();
      }
   }


      public static void lsRecursif(File f) {
      if (!f.exists()) {
         System.out.println( "No such file or directory");
      } else if (f.isDirectory()) {
         for (File file : f.listFiles()) {
            if (file.isFile()) {
                System.out.println(file.getName()+ "\n");
            }else if (file.isDirectory()){
                lsRecursif(file);
            }    
         }
         
      }
   }


   public static void main(String[] args) {
      try {
         lsRecursif(new File(pwd()));
         File f = new File(args[0]);
         f.delete();
         System.out.println("Le fichier existe : " + (f.exists() ? "oui" : "non"));
         if (!f.getParentFile().exists()) {
            f.mkdirs();
         }

         f.createNewFile();
         System.out.println("Le fichier existe : " + (f.exists() ? "oui" : "non"));
         System.out.println(f.getAbsolutePath());
      } catch (IOException e) {
         System.out.println(e);
      }

   }
}
