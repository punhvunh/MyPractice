package by.epam.learn.io.charmy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class WriterMain {
	public static void main(String[] args)  {
		try (FileReader reader = new FileReader("data/info.txt");
			FileWriter fileWriter = new FileWriter("data/out3.txt", true)){
			int symbol = reader.read();
			System.out.println(symbol);
			fileWriter.write(symbol);
			char [] chars = new char[12];
			int charNum = reader.read(chars);
			while(charNum!= -1){
				fileWriter.write(chars, 0 , charNum);
				charNum = reader.read(chars);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
