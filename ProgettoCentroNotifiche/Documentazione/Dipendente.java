public class Dipendente{
    
    
    private final String nome;


    
    public Dipendente(String nome) {
        this.nome = nome;
    }


    
    public void riceviNotifica(String messaggio) {
        System.out.println(nome + " ha ricevuto: " + messaggio);
    }






}