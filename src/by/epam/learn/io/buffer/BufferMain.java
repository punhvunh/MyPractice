package by.epam.learn.io.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferMain {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("data/info.txt");
			 BufferedReader bufferedReader = new BufferedReader(reader);
			 FileWriter fileWriter = new FileWriter("data/out4.txt");
			 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter) ){
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				bufferedWriter.write(line,0, line.length());
				bufferedWriter.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
