package estoilette;

public class ThreadFemmine extends Thread{

    private boolean femmina;
    private Bagno bagno;

    public ThreadFemmine(String name,boolean femmina,Bagno bagno){
        super(name);
        this.femmina=femmina;
        this.bagno=bagno;
    }
    
    @Override
    public void run() {
        try {
            bagno.usaBagno(femmina);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
