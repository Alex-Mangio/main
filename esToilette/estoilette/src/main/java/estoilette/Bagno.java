package estoilette;

public class Bagno {

    private int femmineWait = 0;
    private int maschiWait = 0;
    private boolean occupato = false;

    public synchronized void usaBagno(boolean femmina) throws InterruptedException{
        if(femmina){
            femmineWait++;
            while (occupato || maschiWait > 0) {
                wait();
            }
            femmineWait--;
        }else{
            maschiWait++;
            while(occupato || femmineWait > 0){
                wait();
            }
            maschiWait--;
        }
        occupato=true;
        System.out.println(Thread.currentThread().getName() + " e' in bagno");
        Thread.sleep((int)(Math.random()*1000)+2000);
        occupato=false;
        System.out.println(Thread.currentThread().getName() + " ha finito di usare il bagno");
        notifyAll();
    }
}
