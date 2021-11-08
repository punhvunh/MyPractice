package by.epam.learn.fundaments.operators.flowcontrol.ifelse;

public class IfElse {

	public static void main(String[] args) {
		System.out.println(perimeter(-5.5,7.8, "Fedor"));

	}
	public static double perimeter(double lengthA, double lengthB, String name){
		if (name == null){
			throw new IllegalArgumentException("Wrong name " + name);
		}
		if (lengthA > 0 && lengthB > 0 ){
			return (lengthA + lengthB) * 2;
		}
		else{
			throw new IllegalArgumentException("Wrong data < 0 ");
		}
	}
}
