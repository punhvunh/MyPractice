package by.epam.learn.legacycollections.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) throws IOException {
		PropertyLoader propertyLoader = new PropertyLoader();
		Properties properties = propertyLoader.load("datares/message.properties");
		properties.list(System.out);
		String label = properties.getProperty("label");
		String value = properties.getProperty("abc");
		String valueDefault = properties.getProperty("xyz","Y-");
		System.out.println(value + " " + valueDefault);
		properties.store(new FileWriter("data/messages2.properties"),"Comment Prop");
	}
}
