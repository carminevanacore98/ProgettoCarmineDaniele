package ProgettoCentroNotifiche;

public class Dipendente implements Observer{
    
    private final String nome;
    
    public Dipendente(String nome) {
        
        this.nome = nome;
    }

    public void riceviNotifica(Notifica notifica) {
        
        System.out.println(nome + " ha ricevuto: " + "[" + notifica.getTipo() + "] " + notifica.getMessaggio() + ", " + notifica.getDataOra());
    }
}