package by.epam.learn.io.objectoutputser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data/out.dat"))){
			Book book = new Book(500, "5660");
			objectOutputStream.writeObject(book);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
