package by.epam.learn.collections.comparator;

import by.epam.learn.collections.comparable.Person;

import java.util.ArrayList;
import java.util.Comparator;



public class ComparatorMain implements Comparator<Person> {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(701, "Bod"));
        list.add(new Person(509, "Frank"));
        list.add(new Person(1100, "Fedor"));
        list.add(new Person(40, "Peter"));
//        list.sort(new ComparatorMain());
        //Collections.sort(list, new ComparatorMain());
        list.sort(new Person.NameComparator());
        System.out.println(list);

    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
