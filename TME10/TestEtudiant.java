public class TestEtudiant {
    public static void main(String[] args) {
            //-----------------------------------Ancienne version-------------------------------------
            // for (int i = 0; i < args.length; i++) {
            //    try {
            //     System.out.print(Integer.parseInt(args[i]) + " est une note, ");
            //    } catch (NumberFormatException e) {
            //     System.out.print("\n" + args[i] + " est un nom, ");
            //    } 
            // }
            // System.out.println();
            //---------------------------------------------------------------------------------------

            //---------------------------------Nouvelle version--------------------------------------
             Etudiant eCourant = null;
            for (int i = 0; i < args.length; i++) {
             
                try {
                    eCourant.entrerNote(Integer.parseInt(args[i]));
                } catch ( NumberFormatException e) {
                    eCourant = new Etudiant(args[i]);
                }catch (TabNotesPleinException e){
                    System.out.println(e.getMessage());
                }
                
            }
            System.out.println(Etudiant.afficheListEtudiant());
    }
}
