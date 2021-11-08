package by.epam.learn.threads.daemon;

import by.epam.learn.threads.creating.threadrunnable.TalkThread;
import by.epam.learn.threads.creating.threadrunnable.WalkThread;

public class DaemonMain {

	public static void main(String[] args) {
		Thread talk = new Thread(new TalkThread());
		WalkThread walkThread = new WalkThread();
		talk.setDaemon(true);
		walkThread.start();
		System.out.println("end of Main");

	}
}
