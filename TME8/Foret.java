package TME8;

import java.util.ArrayList;

public class Foret {
    private Object[][] terrain ; 
    public Foret (int maxTaille){
        terrain = new Object[maxTaille][maxTaille];
    }

    public boolean placer(Object obj){
        int i = (int)(Math.random()*(terrain.length));
        int j = (int)(Math.random()*(terrain.length));
        if(terrain[i][j] ==null)
            terrain[i][j] = obj;
        return (terrain[i][j] !=null ? true : false) ;    
    
    }
    public String toString(){
        String s ="";
        for (int i = 0; i < terrain.length; i++) {
            s+="|";
            for (int j = 0; j < terrain.length; j++) {
                if(terrain[i][j] == null){
                s+="  ";}
                else{
                s+= terrain[i][j].toString().charAt(0);
                s+=" ";}
                    
            }
             s+="|\n";
        }
        return s; 
    }
    public ArrayList<Champignon> rammaserChampignons(){
        ArrayList<Champignon> listChampignons = new ArrayList<>();
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain.length; j++) {
                if(terrain[i][j] instanceof Champignon){
                    listChampignons.add((Champignon)terrain[i][j]);
                    terrain[i][j] = null;
                }
            }
        }
        return listChampignons;
    }
    public ArrayList<Ramassable> rammaserTout(){
    ArrayList<Ramassable> ramassable = new ArrayList<>();   
            for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain.length; j++) {
                if(terrain[i][j] instanceof Ramassable){
                    ramassable.add((Ramassable)terrain[i][j]);
                    terrain[i][j] = null;
                }
            }
        }
        return ramassable;
    }
    public void ramasser(Panier p) {
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] instanceof Ramassable) {
                    Ramassable obj = (Ramassable) terrain[i][j];
                        System.out.println( terrain[i][j]+ "Ajouté");
                        p.add(obj);
                        terrain[i][j] = null; // supprime l'objet du terrain
               
                }
            }
        }
    }
}
