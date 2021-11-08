package by.epam.learn.classes.classoptional.optionalint;

import java.util.OptionalInt;

public class OptionalIntMain {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(10);
        int x = optionalInt.getAsInt();
        System.out.println(x);
        OptionalInt optionalInt1 = OptionalInt.empty();
        int y = optionalInt1.orElse(20);
        System.out.println(y);
        int z = optionalInt1.orElseThrow(NumberFormatException::new);


    }
}
