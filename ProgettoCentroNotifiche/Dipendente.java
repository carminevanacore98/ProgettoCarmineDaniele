package ProgettoCentroNotifiche;

import java.util.ArrayList;
import java.util.List;

public class Dipendente implements Observer {
    private final String nome;
    private final List<Notifica> storicoNotifiche = new ArrayList<>();

    public Dipendente(String nome) {
        this.nome = nome;
    }

    @Override
    public void riceviNotifica(Notifica notifica) {
        storicoNotifiche.add(notifica);
        System.out.println(nome + " ha ricevuto: [" + notifica.getTipo() + "] "
                + notifica.getMessaggio() + ", " + notifica.getDataOra());
    }

    public void stampaStoricoNotifiche() {
        
        System.out.println("\n\nStorico " + nome + ":\n" + storicoNotifiche + "\n\n");
    }
}