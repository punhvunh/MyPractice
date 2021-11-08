package by.epam.learn.collections.comparator;

import by.epam.learn.collections.comparable.Person;

import java.util.ArrayList;
import java.util.Comparator;

public class FunctionalComparatorMain {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(701, "Bod"));
        list.add(new Person(509, "Frank"));
        list.add(new Person(1100, "Fedor"));
        list.add(new Person(2, "Fedor"));
        list.add(new Person(25, "Fedor"));
        list.add(new Person(998, "Fedor"));
        list.add(new Person(40, "Peter"));
        System.out.println(list);
//        list.sort((o1, o2) -> o1.getPersonId()-o2.getPersonId());
        list.sort(Comparator.comparing(Person::getName).thenComparing(Person::getPersonId));
        System.out.println(list);
    }
}
