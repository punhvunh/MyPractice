package by.epam.learn.collections.generic;

import java.util.ArrayList;
import java.util.List;

import by.epam.learn.classes.classdesign.subclassstatic.Person;
import by.epam.learn.classes.classdesign.subclassstatic.Student;

public class GenericMain {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Student(1,2));
		list.add(new Student(2,5));
//		list.add("new String");
		list.add(new Person());
		Person person = list.get(2);
	}
}
