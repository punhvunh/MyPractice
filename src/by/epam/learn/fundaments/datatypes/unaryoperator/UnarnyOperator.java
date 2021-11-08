package by.epam.learn.fundaments.datatypes.unaryoperator;

public class UnarnyOperator {

	public static void main(String[] args) {
		int x = 1;
		x *= 2;
		int y = x++;
		System.out.println("Y = " + y);
		x++; // x = x+1
		System.out.println("X = " + x);
		++x;
		System.out.println("X = " + x);
		byte b = 1;
		b++;
		System.out.println("B = " + b);
		float f = 5;
		byte  z = 15;
		z /= f;
		System.out.println("Z = " + z);
		int p = 1;
		p = p++;
		System.out.println("P = " + p);
	}

}
