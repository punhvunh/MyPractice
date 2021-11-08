package by.epam.learn.classes.classdesign.myclass;

import java.util.Objects;

// Класс сущность
public class Subject {
    private  long subjectId;
    private  String name;
// конструкторы не могут быть переопределены, могут быть перегружены, не наследуются, final, static, synchronized, native запрещены;
     public Subject(long subjectId, String name) { // private, public, protected, friendly;
        super(); // можно не писать, ставить только первым;
        this.subjectId = subjectId;
        this.name = name;
    }

    public Subject() {
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }
    // Проверка на отрицателое значение

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return subjectId == subject.subjectId && Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectId, name);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", name='" + name + '\'' +
                '}';
    }
}
