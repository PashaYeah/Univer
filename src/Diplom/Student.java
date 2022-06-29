package Diplom;

public class Student {
    String name;
    String lastname;
    int age;
    private Address address;
    Student (String name, String lastname, int age, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
    }
    public void setAddressStudent(Address address) {
        this.address = address;
    }
    public String toString() {
        System.out.println("Имя студента - " + name + ", фамилия - " + lastname + ", возраст - " + age
                + ", проживающий по адресу: город " + address.city + ", улица " + address.street + ", дом " + address.house + ", квартира " + address.flat);
        }
}



