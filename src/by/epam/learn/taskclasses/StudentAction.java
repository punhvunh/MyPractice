package by.epam.learn.taskclasses;

public class StudentAction {
    public static Student[] studentCreator(){
        Student [] students = new Student[4];
        students[0] = new Student(1,"Fedor", "Manko","Andreevich",
                1994, "Gromova",80296091572L, new StudentUniversity("SF", 4, 201));
        students[1] = new Student(2,"ILya", "Manko","Andreevich",
                1994, "Gromova",80296091575L, new StudentUniversity("SF", 4, 201));
        students[2] = new Student(3,"Karina", "Kruk","Dmitrievna",
                2000, "Nemanskay",80293888536L, new StudentUniversity("FMM", 3, 101));
        students[3] = new Student(4,"Alex", "Drogba","Ivanovich",
                1996, "Esenina",80293091572L, new StudentUniversity("SF", 3, 221));
        return students;
    }
    public static Student[] studentFaculty(Student[] students, String faculty){
        Student[] student1 = new Student[]{};
        for (int i = 0; i < students.length; i++) {
            if (students[i].getStudentUniversity().getFaculty().equals(faculty)) {
                student1 =  new Student[]{students[i]};
            }
        }return student1;
    }
    public static long studentFindIdByName(Student[] students, String name){
        long id = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getName().equals(name)){
                id = students[i].getId();
            }
        }
        return id;
    }
}
