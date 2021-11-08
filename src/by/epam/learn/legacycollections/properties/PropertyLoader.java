package by.epam.learn.legacycollections.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {
	public Properties load(String filename) throws IOException {
		Properties properties = new Properties();
		properties.put("submit","Submit");
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);
		properties.load(inputStream);
	return properties;
	}
}
