package by.epam.learn.classes.classdesign.subclassstatic;

public class Student extends Person {
    static {
        //статический блок инициализации
        faculty = "MMF";
        System.out.println("Hello");
//        int a = 1/0;
    }
    private int yearOfStudy;
    protected String nameOfTheUniversity;
    static String faculty; // сэттер и геттеры не пишут для статического поля

    public Student(int id, String name) {
        super(id, name);
    }

    public Student(int id, String name, int yearOfStudy) {
        super(id, name);
        this.yearOfStudy = yearOfStudy;
    }

    public Student(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Student(int id, int yearOfStudy) {
        super(id);
        this.yearOfStudy = yearOfStudy;
    }
    public static void convertFaculty(String str){
        // не может обращтся к не статическим полям
        System.out.println(str + " " + faculty.toLowerCase());
    }

    @Override
    public String toString() {
        return "Student{" +
                "yearOfStudy=" + yearOfStudy +
                ", nameOfTheUniversity='" + nameOfTheUniversity + '\'' +
                '}';
    }
}
