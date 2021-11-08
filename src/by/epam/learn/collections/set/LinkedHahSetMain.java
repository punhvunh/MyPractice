package by.epam.learn.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;
;

public class LinkedHahSetMain {
    public static void main(String[] args) {
        Set<Car> set = new LinkedHashSet<>();
        set.add(new Car("BMW"));
        set.add(new Car("Mazda"));
        boolean value = set.add(new Car("Mazda"));
        System.out.println(value);
        set.forEach(System.out::println);
    }
}
