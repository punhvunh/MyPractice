package by.epam.learn.threads.synchronizedmy.deadlock;

public class DeadLockMain {
    public static void main(String[] args) {
        InviteAction invite1 = new InviteAction("First");
        InviteAction invite2 = new InviteAction("Second");
        new Thread(()->invite1.invite(invite2)).start();
        new Thread(()->invite2.invite(invite1)).start();
    }
}
