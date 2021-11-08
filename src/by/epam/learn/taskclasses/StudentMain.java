package by.epam.learn.taskclasses;

import java.util.Arrays;

public class StudentMain {
    private static final String FACULTY = "SF";
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println(Arrays.toString(StudentAction.studentCreator()));
        System.out.println("Task 2");
        System.out.println(Arrays.toString(StudentAction.studentFaculty(StudentAction.studentCreator(),FACULTY)));
        System.out.println("Task 3");
        System.out.println(StudentAction.studentFindIdByName(StudentAction.studentCreator(),"Fedor"));
    }

}
