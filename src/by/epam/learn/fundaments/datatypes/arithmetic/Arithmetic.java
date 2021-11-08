package by.epam.learn.fundaments.datatypes.arithmetic;

public class Arithmetic {
	public static void main(String[] args) {
		int x = 8;
		int y = 5;
		int z = x + y; // -*/
		int p = x/y;
		System.out.println(p);
		int r = x % y;
		System.out.println(r);
		// Требуется привидение, т.к всегда int , либо final(не выйдет за диапазон)
		byte a = 110;
		byte b = 2;
		byte c = (byte) (a + b);
		System.out.println(c);
		final short sh = 12;
		final short sh1 = 25;
		short sh2 = sh + sh1;
		System.out.println(sh2);

	}

}
