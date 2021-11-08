package by.epam.learn.threads.locks.reentrantlock;

import java.util.concurrent.TimeUnit;

public class PaymentLockRunner {
    public static void main(String[] args) {
        final PaymentLock paymentLock = new PaymentLock();
        new Thread(() -> paymentLock.doPayment()).start();
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        paymentLock.init();
        System.out.println("the end");
    }
}
