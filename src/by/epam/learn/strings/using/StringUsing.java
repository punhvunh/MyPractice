package by.epam.learn.strings.using;

import java.util.Arrays;
import java.util.List;

public class StringUsing {
    static String str = "hello";
    public static void main(String[] args) {
        String str0 = new String("hello");
        System.out.println(str == str0);
        str0 = str0.intern();
        System.out.println(str == str0);
        String str1 = " ";
        System.out.println(str1.isEmpty());//пустой
        System.out.println(str1.isBlank());//пустой и пробелы
        str1 = "     667      78    ";
//        System.out.println(str1.strip());
        System.out.println(str1.replaceAll("\\s+",""));
        String xss = "<script> alert()</script>";
        System.out.println(xss.replaceAll("</?script>", ""));
        str1 ="7876m,m.877bvbv__-878789-Fghhf<><76";
        String[] strArr = str1.split("\\D+");
        System.out.println(Arrays.toString(strArr));
        String str2 = String.format("java %.2s he%nllo %5.2f","SE00", 55.987754545);
        System.out.println(str2);
        String str3 = String.join("; ", List.of("a", "java", "12", "2019"));
        System.out.println(str3);

    }
}
