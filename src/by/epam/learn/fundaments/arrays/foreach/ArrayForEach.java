package by.epam.learn.fundaments.arrays.foreach;

import java.util.Arrays;

public class ArrayForEach {
    public static void main(String[] args) {
        String [] strings =  {"Java", "Oracle", "<epam>"};
        System.out.println(Arrays.toString(changeAr(strings)));
        StringBuilder[] stringBuilder = new StringBuilder[3];
        stringBuilder[0] = new StringBuilder("Java");
        stringBuilder[1] = new StringBuilder("Oracle");
        stringBuilder[2] = new StringBuilder("<epam>");
        System.out.println(Arrays.toString(changeArBuild(stringBuilder)));
    }
    public static String[] changeAr(String[] strings){
        for (String element : strings) {
            System.out.println(element);
        }
        return strings;
    }
    public static StringBuilder[] changeArBuild(StringBuilder[] stringBuilders){
        for (StringBuilder element:stringBuilders) {
            element.append("Foka");
        }
        return stringBuilders;
    }
}
