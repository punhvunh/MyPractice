package by.epam.learn.threads.timeunitpriority.priority;

import by.epam.learn.threads.creating.threadrunnable.TalkThread;
import by.epam.learn.threads.creating.threadrunnable.WalkThread;

public class PriorityMain {

	public static void main(String[] args) {
		Thread talk = new Thread(new TalkThread());
		WalkThread walkThread = new WalkThread();
		talk.setPriority(Thread.MIN_PRIORITY);
		walkThread.setPriority(Thread.MAX_PRIORITY);
		talk.start();
		walkThread.start();
	}
}
