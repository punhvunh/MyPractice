package by.epam.learn.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(null);
        list.add(42);
        System.out.println(list);
        list.add(4,55);
        System.out.println(list);
        Integer value = list.get(3);
        System.out.println(value);
        System.out.println(list.indexOf(42));
        list.remove(new Integer(42));
        System.out.println(list);
        System.out.println(list.subList(1,3));
    }
}
