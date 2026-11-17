package ProgettoCentroNotifiche;


public class Main {
    public static void main(String[] args) {
        CentroNotifiche centro1 = CentroNotifiche.getInstance();
        CentroNotifiche centro2 = CentroNotifiche.getInstance();

        System.out.println("Il centro è unico? " + (centro1 == centro2));

        Dipendente anna = new Dipendente("Anna");
        Dipendente marco = new Dipendente("Marco");

        centro1.iscrivi(anna);
        centro1.iscrivi(marco);

        NotificaFactory f = new NotificaFactory();

        centro1.inviaNotifica(f.getNotifica(TipoNotifica.RIUNIONE, "Riunione alle 10"));

        centro1.rimuovi(anna);
        centro1.inviaNotifica(f.getNotifica(TipoNotifica.AGGIORNAMENTO ,"Aggiornamento aziendale"));

        centro1.stampaStorico();
        anna.stampaStoricoNotifiche();
        marco.stampaStoricoNotifiche();
    }

}