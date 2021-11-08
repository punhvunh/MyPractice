package by.epam.learn.classes.innerclasses.anonymousclasses.anomenum;

import java.util.Arrays;

public class EnumMain {
	public static void main(String[] args) {
		Arrays.stream(Shape.values()).forEach(e -> System.out.println(e.computerSquare()));
		System.out.println(Shape.RECTANGLE);
	}
}
