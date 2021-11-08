package by.epam.learn.strings.locale;

import java.util.Locale;

public class LocaleMain {
    public static void main(String[] args) {
        Locale locale = Locale.FRANCE;
        Locale locale1 = Locale.getDefault();
        Locale locale2 = new Locale("be");
        Locale locale3 = new Locale("be","BY");
        System.out.println(locale);
        System.out.println(locale1);
        System.out.println(locale2);
        System.out.println(locale3);
        Locale.setDefault(locale3);
        System.out.println(locale1.getDisplayCountry());
    }
}
