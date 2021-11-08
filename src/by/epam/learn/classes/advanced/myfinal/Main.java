package by.epam.learn.classes.advanced.myfinal;

public class Main {

	public static void main(String[] args) {
		Point point = new Point(20);
		int x = point.MAX_RANGE;
		System.out.println(x);
		Point point1 = new Point("Point");
		System.out.println(point1.MAX_RANGE);
	}
}
