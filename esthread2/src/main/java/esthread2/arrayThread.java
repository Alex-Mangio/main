package esthread2;

public class arrayThread extends Thread{

    private Thread thread;
    private int[] arrayInt = new int[10];

    public arrayThread(){
        this.thread = thread;
    }

    @Override
    public void run() {
        for(int i=0;i<arrayInt.length;i++){
            arrayInt[i] = (int)(Math.floor(Math.random()*100)+1);
        }
    }


}
