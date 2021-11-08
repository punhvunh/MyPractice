package by.epam.learn.io.charmy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReaderMain {
	public static void main(String[] args)  {
// перенесли объявление в try чтобы не писать finally с close
		try (FileReader reader = new FileReader("data/info.txt")) {
			int symbol = reader.read();
			char [] chars = new char[12];
			reader.skip(2);
			reader.read(chars);
			System.out.println(Arrays.toString(chars));
			System.out.println(symbol);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
