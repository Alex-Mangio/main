package esthread2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        arrayThread[] thread = new arrayThread[10];

        for (int i = 0; i < thread.length; i++) {
            thread[i] = new arrayThread();
            thread[i].start();
        }

        for(int i=0;i<thread.length;i++){
            try {
                thread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(int i=0;i<thread.length;i++){
            System.out.println(thread[i]);
        }
    }
}