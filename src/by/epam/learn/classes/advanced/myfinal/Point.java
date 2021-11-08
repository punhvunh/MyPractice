package by.epam.learn.classes.advanced.myfinal;

import java.util.Random;

// нельзя наследовать
public final class Point {
	public final int MAX_RANGE;
	final StringBuilder stringBuilder = new StringBuilder();
	private int x;
	private String name;
	// логический блок, можно так делать, но уже тогда в конструкторах MAX_RANGE удалить;
//	{
//		MAX_RANGE = 5;
//	}
	public Point(int x) {
		MAX_RANGE = new Random().nextInt(10_000);
		this.x = x;
		stringBuilder.append("Hello");
	}

	public Point(final String name) {
		this.name = name;
		MAX_RANGE = 1000;
	}

	final double length(){
		return Math.abs(x);
	}
}
