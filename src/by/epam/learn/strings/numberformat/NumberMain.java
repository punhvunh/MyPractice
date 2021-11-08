package by.epam.learn.strings.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberMain {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMANY);
        String source ="1.234,567";
        NumberFormat numberFormatUs = NumberFormat.getInstance(Locale.US);
        NumberFormat numberFormatFr = NumberFormat.getInstance(Locale.FRANCE);
        try {
            double number = numberFormat.parse(source).doubleValue();
            System.out.println(number);
            String resultUs = numberFormatUs.format(number);
            System.out.println("US " +  resultUs);
            String resultFr = numberFormatFr.format(number);
            System.out.println("FR " +  resultUs);
            double numberUS = numberFormatUs.parse(source).doubleValue();
            double numberFR = numberFormatFr.parse(source).doubleValue();
            System.out.println("US parse " + numberUS);
            System.out.println("FR parse " + numberFR);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
