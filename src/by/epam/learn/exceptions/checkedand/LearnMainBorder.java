package by.epam.learn.exceptions.checkedand;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LearnMainBorder {
    public static void main(String[] args) throws ParseException {
        double value = Double.parseDouble("42.05");
        System.out.println(value);
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        value = (double) format.parse("111,42.07");
        System.out.println(value);
    }
}
