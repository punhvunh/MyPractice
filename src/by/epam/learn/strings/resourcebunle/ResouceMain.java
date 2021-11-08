package by.epam.learn.strings.resourcebunle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ResouceMain {
    public static void main(String[] args) {
        Locale locale = new Locale("kz","KZ");
        ResourceBundle bundle = ResourceBundle.getBundle("res.message",locale);
        String s1 = "";
        if(bundle.containsKey("str1")){
             s1 = bundle.getString("str1");
        }
        String s2 = bundle.getString("str2");
        System.out.println(s1 + " " + s2);
        Set<String> strings = bundle.keySet();
        System.out.println(strings);
    }
}
