package by.epam.learn.classes.innerclasses.inner.innerinheritance;

import java.io.Serializable;

public class Student {
    private int studentId;
    private String name;
    private int group;
    private String faculty;
    private Address address;
    // Внутренний класс предназначен для полостью нестатического испльзования
    public class Address extends Thread implements Serializable,Cloneable {
        private String city;
        private String street;
        private int houseId;
        private int flatID;
        private String email;
        private String skype;
        private long phoneNumber;
    }
}