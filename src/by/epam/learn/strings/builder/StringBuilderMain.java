package by.epam.learn.strings.builder;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("hello");
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        stringBuilder.insert(2, "World of Warcraft");
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.delete(20,24));
        System.out.println(stringBuilder.reverse());
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder(45);
        stringBuilder1.append("java");
        stringBuilder2.append(stringBuilder1);
        System.out.println(stringBuilder1 + " " + stringBuilder2);
        System.out.println(stringBuilder1.equals(stringBuilder2) + " " + (stringBuilder1.hashCode() == stringBuilder2.hashCode()));
        System.out.println(stringBuilder1.toString().contentEquals(stringBuilder2));
    }
}
