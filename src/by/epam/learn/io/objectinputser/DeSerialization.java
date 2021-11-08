package by.epam.learn.io.objectinputser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import by.epam.learn.io.objectoutputser.Book;

public class DeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("data/out.dat"));
		Book book = (Book) objectInputStream.readObject();
		System.out.println(book);

	}
}
