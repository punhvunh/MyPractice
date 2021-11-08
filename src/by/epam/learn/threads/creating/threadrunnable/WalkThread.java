package by.epam.learn.threads.creating.threadrunnable;

import java.util.concurrent.TimeUnit;

public class WalkThread extends Thread {
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Walk " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("end of Talk Thread");
            }
        }
    }

}
