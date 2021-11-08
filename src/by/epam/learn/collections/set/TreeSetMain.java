package by.epam.learn.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        Set<Integer> set1 =  new TreeSet<>();
        set1.add(2);
        set1.add(100);
        set1.add(5);
        set1.add(10);
        System.out.println(set1);
        set1.removeIf(i -> i == 5 || i == 10);
        set1.forEach(System.out::println);
    }
}
