package by.epam.learn.threads.locks.reentrantlock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PaymentLock {
    private int amount;
    private ReentrantLock lock = new ReentrantLock(true);
    private Condition condition = lock.newCondition();

    public void doPayment() {
        try {
            System.out.println("Start payment:");
            lock.lock();
            while (amount <= 0) {
                condition.await();
            }
            System.out.println("Payment is closed");
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void init(){
        try{
           lock.lock();
            System.out.println("Init payment:");
            amount = new Scanner(System.in).nextInt();
            condition.signal();
        } finally {
            condition.signal();
            lock.unlock();
        }
    }
}
