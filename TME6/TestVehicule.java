package TME6;

public class TestVehicule {
    public static void main(String[] args) {
        Velo velo = new Velo("MyVTT" , 17);
        //Afficher le vélo créé
        System.out.println(velo.toString());
        //Faire rouler le vélo avec 10 km
        velo.rouler(10);
        //Créer un tableau de 3 véhicules    
        Vehicule[] tab3Vehicules = new Vehicule[3];
        System.out.println();

        tab3Vehicules[0] = velo;
        tab3Vehicules[1] = new Voiture("Peugeot", 50, 5);
        tab3Vehicules[2] = new Camion("Man", 200, 20);
        //Afficher les 3 véhicules
        System.out.println();
        System.out.println(tab3Vehicules[0].toString());
        System.out.println(tab3Vehicules[1].toString());
        System.out.println(tab3Vehicules[2].toString());
        
        //Faire rouler les 3 véhicules de 10km 
        System.out.println();
        for (int i = 0; i < 3; i++) {
            tab3Vehicules[i].rouler(10); 
        }
    }
    
}
