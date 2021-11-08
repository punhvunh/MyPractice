package by.epam.learn.collections.comparable;

import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person(701, "Bod"));
        set.add(new Person(509, "Frank"));
        set.add(new Person(1100, "Fedor"));
        set.add(new Person(40, "Peter"));
        System.out.println(set);
    }
}
