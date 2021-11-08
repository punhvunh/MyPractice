package by.epam.learn.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMani {
    public static void main(String[] args) {
        SortedSet<String> strings = new TreeSet<>();
        strings.add("Foka");
        strings.add("fedor");
        strings.add("wow");
        System.out.println(strings.first());
    }
}
