package Diplom.model;

import Diplom.base.People;

public class Student extends People {

    public Student(String name, String lastname, int age, Address address, String gender) {
        super(name, lastname, age, address, gender);
    }

    public String toString() {
        return "\n" + "Имя студента - " + super.getName() + ", фамилия - " + super.getLastname() + ", возраст - " + super.getAge()
                + ", проживающий по адресу: " + super.getAddress().toString();
    }

    ///////////////////////////////////////////////////

}



