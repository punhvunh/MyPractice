package by.epam.learn.classes.innerclasses.nested.nestedinner;

import java.util.Comparator;

public class Owner {
	private int value = 1;
	static int staticValue = 2;

	public Owner(int value) {
		this.value = value;
	}

	public static class ValueComparator implements Comparator<Owner> {
		@Override
		public int compare( Owner o1,  Owner o2) {
			return o1.value - o2.value;
		}
	}
}
