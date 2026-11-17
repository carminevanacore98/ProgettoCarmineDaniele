package ProgettoCentroNotifiche;

public class NotificaFactory {
    
    public Notifica getNotifica(TipoNotifica tipo, String messaggio){

        return new Notifica(tipo, messaggio);
    }
}
