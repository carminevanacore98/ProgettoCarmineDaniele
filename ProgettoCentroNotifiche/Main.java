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

        centro1.inviaNotifica("Riunione alle 10");

        centro1.rimuovi(anna);
        centro1.inviaNotifica("Aggiornamento aziendale");
    }

}