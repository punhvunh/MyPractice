package by.epam.learn.strings.dateformat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatMain {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.MEDIUM,
                new Locale("be", "BY"));
        String str = dateFormat.format(new Date());
        System.out.println(str);

        try {
            Date date = dateFormat.parse("субота, 12 лістапада 2221 г., 11:38:06");
            System.out.println(date);
            DateFormat dateFormatCanada = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT,Locale.CANADA);
            System.out.println(dateFormatCanada.format(date));
            DateFormat dateFormatFr = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG,Locale.FRANCE);
            System.out.println(dateFormatFr.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
