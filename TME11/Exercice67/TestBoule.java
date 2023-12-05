
import java.util.ArrayList;
public class TestBoule {
    public static void main(String[] args) {

        Boule b1 = new Boule ( " rouge " ) ;
        Boule b2 = new Boule ( " jaune " ) ;
        Boule b3 = new Boule ( " bleue " ) ;
        Boule b4 = b1 ;
        Boule[] urne = {b1,b2,b3,b4};
        Boule choix = urne[(int)(Math.random()*urne.length)];
        choix.getClass();
        ArrayList<Boule> gdeUrne = new ArrayList<Boule>();
        //Q67.5
        //les lignes de code pour générer 1000 boules à
        //l’aide de la classe précédente et les stocker dans une ArrayList (nommée gdeUrne)
        for (int i = 0; i < 1000; i++) {
            gdeUrne.add(BouleFactory.build());
        }
        //Q6
        for (String color : BouleFactory.couleurs) {
            Boule b = new Boule(color);
            int cpt = 0 ;
            for (Boule boule : gdeUrne) {
                if (b.equals(boule)) {
                    cpt++;
                }
            }
            System.out.println("Couleur " + color + " nombre de boules trouvées de cette couleur est " + cpt);
        }

        //Q67.7
        //le code permettant de stocker 1000 BouleV2 tirées aléatoirement dans une ArrayList
        ArrayList<BouleV2> gdeUrneV2 = new ArrayList<BouleV2>();
         BouleV2[] urneV2 = {BouleV2.BLEUE,BouleV2.JAUNE,BouleV2.ROUGE,BouleV2.VERTE};

        for (int i = 0; i < 1000; i++) {
            gdeUrneV2.add(urneV2[(int)(Math.random( )*urneV2.length )]);
        }

        //------une autre version (Plus long)----------------
        // ArrayList<BouleV2> gdeUrneV2 = new ArrayList<>();
        // for (int i = 0; i < 1000; i++) {
        //     int randomIndex = (int) (Math.random() * 4);
        //     BouleV2 boule = null;
        //     switch (randomIndex) {
        //         case 0:
        //             boule = BouleV2.ROUGE;
        //             break;
        //         case 1:
        //             boule = BouleV2.JAUNE;
        //             break;
        //         case 2:
        //             boule = BouleV2.BLEUE;
        //             break;
        //         case 3:
        //             boule = BouleV2.VERTE;
        //             break;
        //     }
        //     gdeUrneV2.add(boule);
        // }

/*          (a)Très sécurisé, on ne peut pas créer d'autres objets

            (b) 4 objets à créer plus rapide que 1000 simple, besoin de moins de mémoire

            (c) égalité réferentielle suffisante (4 références différentes)

            Inconvinient : le client ne peut pas ajouter des couleur 

        }
}*/
    }
}