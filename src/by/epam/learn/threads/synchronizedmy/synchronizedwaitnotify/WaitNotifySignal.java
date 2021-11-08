package by.epam.learn.threads.synchronizedmy.synchronizedwaitnotify;

public class WaitNotifySignal {
    private boolean ready;

    public synchronized void consume(){
        while (!ready){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ready = false;
        System.out.println("Consume");
    }

    public synchronized void produce(){
        System.out.println("Produce");
        ready = true;
        notify();
    }
}
