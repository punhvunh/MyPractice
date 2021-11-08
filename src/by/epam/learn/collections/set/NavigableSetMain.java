package by.epam.learn.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMain {
    public static void main(String[] args) {
        NavigableSet<String> strings = new TreeSet<>();
        strings.add("b");
        strings.add("a");
        strings.add("c");
        System.out.println(strings.descendingIterator());
    }
}
