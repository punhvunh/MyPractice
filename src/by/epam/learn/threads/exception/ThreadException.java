package by.epam.learn.threads.exception;

import java.util.concurrent.TimeUnit;

public class ThreadException {

	public static void main(String[] args) {
		new Thread(()-> {
			boolean  flag =  true;
//			if(flag){
//				throw new RuntimeException();
//			}
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("end of ExceptedThread");
		}).start();
		try {
			TimeUnit.MILLISECONDS.sleep(20);
			throw new RuntimeException();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end of Main");

	}
}
