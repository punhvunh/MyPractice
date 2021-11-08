package by.epam.learn.collections.wildcard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import by.epam.learn.classes.classdesign.subclassstatic.Person;
import by.epam.learn.classes.classdesign.subclassstatic.Student;

public class WildCardMain {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person());
		list.add(new Student(5));
		action(list);
		List<Student> students = new ArrayList<>();
		students.add(new Student(5));
		action(students);
	}
	static void action(List<? extends Person> list ){
		//добавлять запрещено
		list.remove(0);
		Stream<? extends Person> stream = list.stream();


	}


}
