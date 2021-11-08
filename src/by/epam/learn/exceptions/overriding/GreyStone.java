package by.epam.learn.exceptions.overriding;

import java.io.FileWriter;
import java.io.IOException;

public class GreyStone extends Stone{
	@Override
	public void accept( String data) throws IOException {
		FileWriter fileWriter = new FileWriter("data");
	}

}
