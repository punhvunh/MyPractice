package by.epam.learn.classes.innerclasses.inner.vision;
public class Student {
    private int studentId;
    private String name;
    private int group;
    private String faculty;
    private Address address;

    public class Address  {
        private String city;
        private String street;
        private int houseId;
        private int flatID;
        private String email;
        private String skype;
        private long phoneNumber;

        public Address() {
        }
    }

    public Student() {
    }

    public Address getAddress() {
        return address;
    }
}
