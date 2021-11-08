package by.epam.learn.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(){
            {
                this.add("one");
                this.add("two");
                this.add("ten");
            }
        };
        set.add("one");
        set.add("two");
        boolean value = set.add("ten");
        System.out.println("Выводим первый set" + " " + set + " " + value);
        value = set.add("ten");
        System.out.println(set + " "+ value);
        System.out.println(("Содержит ли он в себе one? " + " " + set.contains("one")));
//        set.clear();
//        System.out.println(set);
        System.out.println("Пустой ли?" + " " + set.isEmpty());
        System.out.println("Размер" + " " +set.size());
        Object[] str = set.toArray();
        System.out.println(Arrays.toString(str));
        set.remove("one");
        System.out.println(set);
        Set<String> set1 = new HashSet();
        set1.add("Hello");
        set.addAll(set1);
        System.out.println(set1);
        System.out.println(set);
        System.out.println(set.iterator());
        boolean x;
        set.removeIf(i-> i.equals("two") || i.equals("Hello"));
        System.out.println(set);
    }
}
