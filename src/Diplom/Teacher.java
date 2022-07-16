package Diplom;

public class Teacher extends People {

    public Teacher(String name, String lastname, int age, Address address) {
        super(name, lastname, age, address);
    }

    @Override
    public String toString() {
        return "Имя учителя - " + super.getName() + ", фамилия - " + super.getLastname() + ", возраст - " + super.getAge()
                + ", проживающий по адресу: " + super.getAddress().toString();
    }
    double hourlyPayment;
    double hours;

    public void payment(double hourlyPayment, double hours) {
        double pay = hourlyPayment * hours;
        System.out.println("Заработная плата учителя за месяц составляет " + pay + "рублей, за " + hours + " отработанных часов.");
    }

}
