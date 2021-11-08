package by.epam.learn.threads.synchronizedmy.synchronizedblock;

import java.util.concurrent.TimeUnit;

public class ThreadSave {
    static int counter;
    public static void main(String[] args) {
        StringBuffer info = new StringBuffer();
        new Thread(() ->{
            synchronized (info) {
                do {
                    info.append('A');
                    System.out.println(info);
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } while (counter++ < 6);
            }
        }).start();


            while(counter++ < 3){
                info.append('Z');
                System.out.println(info);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
