
package ProgettoCentroNotifiche;

import java.util.ArrayList;
import java.util.List;

/**
 * CentroNotifiche
 */
public class CentroNotifiche {

    private static CentroNotifiche singleton = new CentroNotifiche();
    private List<Observer> dipendenti;
    private  List<Notifica> storico;

    private CentroNotifiche(){

        this.dipendenti = new ArrayList<>();
        this.dipendenti = new ArrayList<>();
    }

    public static CentroNotifiche getInstance(){

        return singleton;
    }

    public void inviaNotifica(Notifica notifica){

        storico.add(notifica);
        for(Observer d: dipendenti){

            d.riceviNotifica(notifica);
        }
    }

    public void iscrivi(Dipendente d){

        dipendenti.add(d);
    }

    public void rimuovi(Dipendente d){

        dipendenti.remove(d);
    }

    public void stampaStorico(){

        System.out.println("\n\nStorico notifiche: " + storico + "\n\n");
    }
}