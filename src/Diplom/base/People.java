package Diplom.base;

import Diplom.model.Address;

public class People {
    private String name;
    private String lastname;
    private int age;
    private Address address;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public People(String name, String lastname, int age, Address address, String gender) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public People() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
