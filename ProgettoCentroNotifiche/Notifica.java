package ProgettoCentroNotifiche;

import java.time.LocalDateTime;

public class Notifica {
    private final TipoNotifica tipo;
    private final String messaggio;
    private final LocalDateTime dataOra;

    public Notifica(TipoNotifica tipo, String messaggio) {
        this.tipo = tipo;
        this.messaggio = messaggio;
        this.dataOra = LocalDateTime.now();
    }

    public TipoNotifica getTipo() {
        return tipo;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public LocalDateTime getDataOra() {
        return dataOra;
    }
}