package by.epam.learn.collections.set;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTreeMain {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(1000);
        words.add("8Y1");
        words.add("7hy");
        words.add("my8");
        words.add("8Y1");
        words.add("mu90");
        System.out.println(words);
        TreeSet<String> treeSet = new TreeSet<>(words);
        System.out.println(treeSet);
        for (String element: words) {
            System.out.print(element.hashCode() + " ");
        }
    }
}
