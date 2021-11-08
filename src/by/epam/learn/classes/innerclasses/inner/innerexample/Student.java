package by.epam.learn.classes.innerclasses.inner.innerexample;

public class Student {
    public  void main(String[] args) {
        Address addressMy = new Student.Address();
        Student.Address addressMu = new Student().new Address();
        Student student = new Student();
    }
    private int studentId;
    private String name;
    private int group;
    private String faculty;
    private Address address;
    // Внутренний класс предназначен для полостью нестатического испльзования
    class Address {
        private String city;
        private String street;
        private int houseId;
        private int flatID;
        private String email;
        private String skype;
        private long phoneNumber;

        public Address() {
        }


        public void action(){
            city = "Minsk";
            name = "Fedor";
            operation();
        }
    }

    public Student() {
    }
    public void operation(){
        address.city = "Kiev";
        address.email = "foka";

    }

}
