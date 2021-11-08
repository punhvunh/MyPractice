package by.epam.learn.fundaments.operators.equaity;

public class LearnEquality {
	public static void main(String[] args) {
		int count = 1;
		System.out.println(count < 1);
		System.out.println(count > 1);
		System.out.println(count <= 0);
		System.out.println(count >= -1);
		System.out.println(count == 0);
		System.out.println(count != 1);
		Object object1 = new Object();
		Object object2 = new Object();
		Object object4 = object1;
		System.out.println(object1 == object4);
		Object object3 = null;
		System.out.println(object1 == object2);
		System.out.println(object3 == null);
		float result = 1/3.0F*3;
		System.out.println(result == 1.f);
		System.out.println(1.000000014435345f == 1.000000024463497f);// машинный ноль
	}
}
