package ProgettoCentroNotifiche;

import java.time.LocalDateTime;

public class NotificaFactory {
    
    public Notifica getNotifica(TipoNotifica tipo, String messaggio){

        LocalDateTime currentTime = LocalDateTime.now();

        return new Notifica(tipo, messaggio);
    }
}
