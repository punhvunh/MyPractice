package by.epam.learn.io.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BufferMainJava8 {
	public static void main(String[] args) {
		try (FileReader reader = new FileReader("data/info.txt");
			 BufferedReader bufferedReader = new BufferedReader(reader)){
			ArrayList<String> strings = new ArrayList<>();
			 bufferedReader.lines().forEach(strings::add);
			System.out.println(strings);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
