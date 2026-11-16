
package ProgettoCentroNotifiche;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * CentroNotifiche
 */
public class CentroNotifiche {

    private static CentroNotifiche singleton = new CentroNotifiche();
    private List<Dipendente> dipendenti;

    private CentroNotifiche(){

        this.dipendenti = new ArrayList<>();
    }

    public CentroNotifiche getInstance(){

        return singleton;
    }

    public void inviaNotifica(String notifica){

        for(Dipendente d: dipendenti){

            d.riceviNotifica(notifica);
        }
    }
}