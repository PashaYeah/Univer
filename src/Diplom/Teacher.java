package Diplom;

import WorkTask12.model.User;

import java.util.List;
import java.util.Map;

public class Teacher extends People {
    double hourlyPayment;
    double hours;
    public Teacher(String name, String lastname, int age, Address address, double hourlyPayment, double hours) {
        super(name, lastname, age, address);
        this.hourlyPayment = hourlyPayment;
        this.hours = hours;
    }

    public double getHourlyPayment() {
        return hourlyPayment;
    }

    public double getHours() {
        return hours;
    }

    public void setHourlyPayment(double hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Имя учителя - " + super.getName() + ", фамилия - " + super.getLastname() + ", возраст - " + super.getAge()
                + ", проживающий по адресу: " + super.getAddress().toString();
    }


    public void payment(double hourlyPayment,double hours) {

        double pay = hourlyPayment * hours;
        System.out.println("Заработная плата учителя за месяц составляет " + pay + " рублей, за " + hours + " отработанных часов.");
    }

}
