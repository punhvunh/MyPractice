package by.epam.learn.classes.innerclasses.nested.nestedinner;

public class NestedMain {
	public static void main(String[] args) {
		Owner.ValueComparator valueComparator = new Owner.ValueComparator();
		System.out.println(valueComparator.compare(new Owner(10), new Owner(11)));


	}
}
