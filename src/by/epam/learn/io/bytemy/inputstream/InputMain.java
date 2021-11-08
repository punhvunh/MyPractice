package by.epam.learn.io.bytemy.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputMain {
	public static void main(String[] args) {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream("data/info.txt");
			byte [] b = new byte[16];
			 int num = inputStream.read(b);
			System.out.println("num = "  + num);
			System.out.println(Arrays.toString(b));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputStream != null){
					inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
