package by.epam.learn.threads.blockingqueuedeque;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueMain {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(5);
        new Thread(() -> {
            for(int i = 0; i < 10; i++){
                try {
                   boolean flag = queue.offer("Java" + i);
                    System.out.println("Element index " + i + " added " + flag);
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for(int i = 0; i < 5; i++){
                try {
                    System.out.println("Element " + queue.poll() + " took ");
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
        try{
            TimeUnit.SECONDS.timedJoin(Thread.currentThread(),5);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(queue);
    }
}
