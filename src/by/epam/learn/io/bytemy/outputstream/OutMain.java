package by.epam.learn.io.bytemy.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutMain {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("data/out.txt", true);
		// цифры это коды символов
		byte [] value = {65, 67, 100};
		fileOutputStream.write(48);
		fileOutputStream.write(value);
		System.out.println();
	}
}
