package by.epam.learn.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedArrayMain {

	public static void main(String[] args) {
		List<Double> list = new LinkedList<>();
		list.add(5.5);
		list.add(6.2);
		list.add(1.3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.lastIndexOf(6.2));
		Double d = list.get(2);
		System.out.println(d);
	}
}
