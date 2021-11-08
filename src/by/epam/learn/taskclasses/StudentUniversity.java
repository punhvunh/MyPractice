package by.epam.learn.taskclasses;

import java.util.Objects;

public class StudentUniversity extends StudentInformation {
    private String faculty;
    private int course;
    private int group;

    public StudentUniversity() {
    }

    public StudentUniversity(String faculty, int course, int group) {
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentUniversity that = (StudentUniversity) o;
        return course == that.course && group == that.group && Objects.equals(faculty, that.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty, course, group);
    }

    @Override
    public String toString() {
        return "StudentUniversity{" +
                "faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
