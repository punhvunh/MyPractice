package by.epam.learn.io.prop;

import java.util.Properties;

public class PrpMain {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
		properties.list(System.out);
	}
}
