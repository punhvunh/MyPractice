package by.epam.learn.collections.wildcardsuper;

import java.util.ArrayList;
import java.util.List;

import by.epam.learn.classes.classdesign.subclassstatic.Student;

public class WildCardSuper {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(5));


	}
	static void action(List<? super Student> list ){
		list.remove(0);
		list.add(new Student(6));

	}
}
