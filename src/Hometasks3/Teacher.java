package Hometasks3;

public class Teacher {
    String name;
    String lastname;
    int age;
    private Address address;
    Teacher (String name, String lastname, int age, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
    }
    public void setAddressTeacher(Address address) {
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Имя учителя - " + name + ", фамилия - " + lastname + ", возраст - " + age
                + ", проживающий по адресу: город " + address.city + ", улица " + address.street + ", дом " + address.house + ", квартира " + address.flat);
    }
    double hourlyPayment;
    double hours;

    public void payment(double hourlyPayment, double hours) {
        double pay = hourlyPayment * hours;
        System.out.println("Заработная плата учителя за месяц составляет " + pay + "рублей, за " + hours + " отработанных часов.");
    }

}
