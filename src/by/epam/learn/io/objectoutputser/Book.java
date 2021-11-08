package by.epam.learn.io.objectoutputser;

import java.io.Serial;
import java.io.Serializable;

public class Book implements Serializable {
	static String  name = "Lord of The Rings Foka";
	private int numberOfPages;
	private transient String password;
	@Serial
	private static final long serialVersionUID = 1L;

	public Book(final int numberOfPages, final String password) {
		this.numberOfPages = numberOfPages;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Book{"  + name + " numberOfPages=" + numberOfPages + ", password='" + password + '\'' + '}';
	}
}
