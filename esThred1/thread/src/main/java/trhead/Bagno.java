package trhead;

import java.util.concurrent.Semaphore;

public class Bagno {

    private Semaphore semaforo;

    public Bagno(int nPosti){
        this.semaforo = new Semaphore(nPosti);
    }

    public Semaphore getSemaforo() {
        return semaforo;
    }
     

    public void entra(String nome){
        try{
            semaforo.acquire();
            System.out.println(nome + " e' entrato in bagno");
            Thread.sleep((int)(Math.floor(Math.random()*2000)+1000));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void esce(String nome){
        System.out.println(nome + " e' uscito dal bagno");
        semaforo.release();
    }



}
