package TME11.Exercice72;

public class TestStringBuilder {
    public static String testString(int nbIter, String chaine) {
        String s = "";
        for (int i = 0; i < nbIter; i++) {
            s += chaine;
        }
        return s;
    }

    public static StringBuilder testStringBuilder(int nbIter, String chaine) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nbIter; i++) {
            sb.append(chaine);
        }
        return sb;
    }

    public static void main(String[] args) {
        int nbIter = 100000; // Nombre d’itérations
        if (args.length == 1) {
            nbIter = Integer.parseInt(args[0]);
        }

        String[] tab = {"1", " 1234567890 ", " 123456789012345678901234567890 "};

        for (String chaine : tab) {
            System.out.println("### nbIter = " + nbIter + " longueur = " + chaine.length());

            long debut1 = System.currentTimeMillis();
            testString(nbIter, chaine);
            long fin1 = System.currentTimeMillis();
            System.out.println("String Durée: " + (fin1 - debut1) + " ms");

            long debut2 = System.currentTimeMillis();
            testStringBuilder(nbIter, chaine);
            long fin2 = System.currentTimeMillis();
            System.out.println("StringBuilder Durée: " + (fin2 - debut2) + " ms");
        }
    }
}

// Réponse 72.1: La classe String en Java est immuable,
// ce qui signifie que chaque opération de concaténation crée une nouvelle instance de String.
// Lorsque vous effectuez des concaténations répétées dans une boucle,
// cela entraîne la création de nombreuses instances temporaires de String,
// ce qui peut être coûteux en termes de performances. À chaque nouvelle concaténation,
// une nouvelle copie de la chaîne est créée avec les données existantes plus le nouveau fragment de la chaîne.

// D'autre part, la classe StringBuilder est mutable,
// ce qui signifie que vous pouvez modifier le contenu de l'objet sans créer une nouvelle instance à chaque opération de concaténation.
// Cela rend StringBuilder beaucoup plus efficace pour les opérations de concaténation répétées,
// car il évite la création constante de nouvelles instances de chaînes.


// Réponse 72.2: Oui, la longueur de la chaîne concaténée a une influence significative sur les performances de la classe String
// Plus la chaîne est longue, plus la création de nouvelles instances de String à chaque concaténation devient coûteuse,
// entraînant des temps d'exécution plus longs.

// En ce qui concerne StringBuilder, bien que la longueur de la chaîne soit importante,
// l'impact sur les performances est généralement moins significatif par rapport à String.
// Cependant, dans tous les cas, StringBuilder est plus efficace que String pour les opérations de concaténation répétées,
// quelle que soit la longueur de la chaîne.


// Réponse 72.3: Quand il y a beaucoup de concaténations de chaînes de caractères,
// il est recommandé d'utiliser la classe StringBuilder.
// StringBuilder est plus efficace dans ce contexte car il minimise la création d'instances temporaires de chaînes,
// ce qui conduit à des performances globalement meilleures par rapport à l'utilisation de la classe String.