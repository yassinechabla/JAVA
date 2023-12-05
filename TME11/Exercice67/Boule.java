

 public class Boule {
 private String couleur ;
    public Boule ( String couleur ) {
        this.couleur = couleur ;
 }

    //Q6
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj==null) {
            return false;
        }
        if (this.getClass()!=obj.getClass()) {
            return false;
        }
        Boule other = (Boule)obj;
        return couleur.equals(other.couleur);
    }
 }

 //---------------------------------------------EXERCICE 67-------------------------------------------------------

 //Q1
 //Il y a 4 variables et 3 instances de Boule 

 //Q2
 // Boule[] urne = {b1,b2,b3,b4}

 //Q3
 //Boule choix = urne[(int)(Math.random())*urne.length];
 //La probabilité de tirer une boule rouge est 2/4 = 1/2 

 //Q4
 // L'erreur qui empêche la compilation : la méthode build est une méthode de classe (statique) essayant d'utiliser 
 //la variable couleurs qui est déclarée comme variable d'instance =>la solution est de rendre la variable couleurs statique
 //L'erreur qui provoque le dysfonctionnement : on ne cast que le Math.random() en int ce qui donne toujours 0=> il faut
 //ajouter des parenthèses 





 
