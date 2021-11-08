package by.epam.learn.taskclasses;

import java.util.Objects;

public class Student extends StudentInformation{
    private long id;
    private String name;
    private String surname;
    private String patronymic;
    private int dateOfBirth;
    private String address;
    private long phoneNumber;
    private StudentUniversity studentUniversity;

    public Student() {
    }

    public Student(long id, String name, String surname, String patronymic, int dateOfBirth, String address, long phoneNumber, StudentUniversity studentUniversity) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.studentUniversity = studentUniversity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public StudentUniversity getStudentUniversity() {
        return studentUniversity;
    }

    public void setStudentUniversity(StudentUniversity studentUniversity) {
        this.studentUniversity = studentUniversity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && phoneNumber == student.phoneNumber && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(patronymic, student.patronymic) && Objects.equals(dateOfBirth, student.dateOfBirth) && Objects.equals(address, student.address) && Objects.equals(studentUniversity, student.studentUniversity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, patronymic, dateOfBirth, address, phoneNumber, studentUniversity);
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", studentUniversity=" + studentUniversity + "\n";
    }
}
