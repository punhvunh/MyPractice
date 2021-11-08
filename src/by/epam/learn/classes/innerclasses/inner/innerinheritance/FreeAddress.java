package by.epam.learn.classes.innerclasses.inner.innerinheritance;

public class FreeAddress extends Student.Address {
    //или
    public FreeAddress() {
        new Student().super();
    }
    //или
    public FreeAddress(Student student) {
         student.super();
    }
}
