package by.epam.learn.classes.innerclasses.localineer.example;

public class Main {
    public static void main(String[] args) {
        AbstractTeacher teacher = TeacherCreator.abstractTeacher(6);
        System.out.println(teacher.getClass());
        boolean result = teacher.excludeStudent(new Student());
        System.out.println("Exclude " + result);
        teacher = TeacherCreator.abstractTeacher(5);
        result = teacher.excludeStudent(new Student());
        System.out.println("Exclude " + result);
    }
}
