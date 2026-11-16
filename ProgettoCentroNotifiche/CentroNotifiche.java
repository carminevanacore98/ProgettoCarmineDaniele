
package ProgettoCentroNotifiche;

import java.util.ArrayList;
import java.util.List;

/**
 * CentroNotifiche
 */
public class CentroNotifiche {

    private static CentroNotifiche singleton = new CentroNotifiche();
    private List<Dipendente> dipendenti;

    private CentroNotifiche(){

        this.dipendenti = new ArrayList<>();
    }

    public static CentroNotifiche getInstance(){

        return singleton;
    }

    public void inviaNotifica(String notifica){

        for(Dipendente d: dipendenti){

            d.riceviNotifica(notifica);
        }
    }

    public void iscrivi(Dipendente d){

        dipendenti.add(d);
    }

    public void rimuovi(Dipendente d){

        dipendenti.remove(d);
    }
}