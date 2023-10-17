package JAVA.TME6;

public class Orchestre {
    private static int nbInstruments = 0;
    private Instrument[] tab ; 
    public Orchestre(int max){
        tab = new Instrument[max];
    
    }
    public void ajouterInstrument(Instrument x){
        if(nbInstruments<tab.length){
            tab[nbInstruments] = x;
            nbInstruments++;
        }else{
            System.out.println("L'orchestre est plein");
        }
    }
    public void jouer(){
        for (Instrument instru : tab) {
            if(instru!=null)
            instru.jouer();;
        }
    }
}
