package by.epam.learn.classes.classdesign.subclassstatic;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(10,"Fedor");
        Student student = new Student(15,"Fedor", 2016);
        student.nameOfTheUniversity = "BNTU";
        System.out.println(person.equals(student));
        Person person1 = new Person(10,"Fedor");
        System.out.println(person1.equals(person));
        Student.convertFaculty("Manko");
//        student = null;
//        student.faculty = "fs"; // так нельзся
//        System.out.println(student.faculty);
    }
}
