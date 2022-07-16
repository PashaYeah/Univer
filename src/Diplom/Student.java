package Diplom;

public class Student extends People {

    public Student(String name, String lastname, int age, Address address) {
        super(name, lastname, age, address);
    }

    public String toString() {
        return "Имя студента - " + super.getName() + ", фамилия - " + super.getLastname() + ", возраст - " + super.getAge()
                + ", проживающий по адресу: " + super.getAddress().toString();
    }
}



