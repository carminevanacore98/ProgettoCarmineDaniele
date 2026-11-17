package ProgettoCentroNotifiche;

import java.util.ArrayList;
import java.util.List;

public class Dipendente implements Observer {
    private final String nome;
    private final List<String> storicoNotifiche = new ArrayList<>();

    public Dipendente(String nome) {
        this.nome = nome;
    }

    @Override
    public void riceviNotifica(String messaggio) {
        storicoNotifiche.add(messaggio);
        System.out.println(nome + " ha ricevuto: " + messaggio);
    }

    public List<String> getStoricoNotifiche() {
        return new ArrayList<>(storicoNotifiche);
    }
}
