package by.epam.learn.classes.immutable;

public class Run {
    public static void main(String[] args) {
        ImmutableSubject immutableSubject = new ImmutableSubject(22,"Fedor");
        System.out.println(immutableSubject.getName());
    }
}
