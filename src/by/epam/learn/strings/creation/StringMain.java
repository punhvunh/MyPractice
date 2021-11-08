package by.epam.learn.strings.creation;

public class StringMain {
    static String str = "hello";
    public static void main(String[] args) {
        String str0 = "hello";
        System.out.println(str == str0);
        char[] chars = {'j', 'a', 'v', 'a'};
        System.out.println(new String(chars));
        byte [] bytes = {48, 53, 65, 90, 97};
        System.out.println(new String(bytes));
        String str1 = "java" + 1 + Integer.parseInt("2");
        String str2 =  1 + Integer.parseInt("2") + "java" + false + null;
        System.out.println(str1);
        System.out.println(str2);
        str1+=str0;
        System.out.println(str1);
    }
}
