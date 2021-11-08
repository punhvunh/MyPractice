package by.epam.learn.exceptions.checkedand;

public class LearnMainThrow {

	public static void main(String[] args) {
		int a = -42;
		if (a <= 0 ){
			throw  new IllegalArgumentException("Wrong number");
		}
		double res = Math.pow(a,2);
		System.out.println(res);
	}

}
