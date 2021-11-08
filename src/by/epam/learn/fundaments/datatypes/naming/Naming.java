package by.epam.learn.fundaments.datatypes.naming;

public class Naming {
	public static void main(String[] args) {
		int variant = 1;
		int variantUnix = 10;
		// не рекомендуется так называть, запрещены скобки № #, арифмитические символы
		int _variant = 2;
		int $variant = 3;
		final int MAX_VALUE = 1_000;
		// примитиыне типы данных
		byte x = 127;
		short y = 1024;
		int z, g;
		int time = z = 1;
		long p = 1_000_000_000_000_000_000L;
		float f;
		double d;
		char c = 'c';
		// код символа
		char ch = 5;
		boolean bool = true;
	}
}
