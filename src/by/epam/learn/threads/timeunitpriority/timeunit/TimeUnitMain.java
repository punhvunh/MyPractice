package by.epam.learn.threads.timeunitpriority.timeunit;

import java.util.concurrent.TimeUnit;

public class TimeUnitMain {

	public static void main(String[] args) {
		long timeout = 1000*60*(60*25+32);
		try {
			TimeUnit.MINUTES.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//		try {
//			Thread.sleep(1000*60*(60*25+32));
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println(timeout);
	}
}
