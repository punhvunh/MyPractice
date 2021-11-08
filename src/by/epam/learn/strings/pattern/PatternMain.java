package by.epam.learn.strings.pattern;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternMain {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("java");
        String[] res = pattern.split("dfjava12-- java5432",2);
        System.out.println(Arrays.toString(res));
        System.out.println(Pattern.matches("y*z","yyz"));
    }
}
