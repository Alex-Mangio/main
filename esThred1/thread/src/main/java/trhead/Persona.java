package trhead;


public class Persona extends Thread{

    private Bagno b;

    public Persona(String name,Bagno b){
        super(name);
        this.b = b;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        b.entra(name);
        b.esce(name);
    }
}
