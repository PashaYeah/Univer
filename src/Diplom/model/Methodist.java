package Diplom.model;

import Diplom.base.People;

public class Methodist extends People {

    public Methodist(String name, String lastname, int age, Address address, String gender,double hourlyPayment, double hours) {
        super(name, lastname, age, address, gender);
        this.hourlyPayment = hourlyPayment;
        this.hours = hours;
    }

    public double getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(double hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Имя методиста - " + super.getName() + ", фамилия - " + super.getLastname() + ", возраст - " + super.getAge()
                + ", проживающий по адресу: " + super.getAddress().toString();
    }
    double hourlyPayment;
    double hours;

    public void payment(double hourlyPayment, double hours) {
        double pay = hourlyPayment * hours;
        System.out.println("Заработная плата методиста " + super.getName() + " " + super.getLastname() + " за месяц составляет " + pay + " рублей, за " + hours + " отработанных часов.");
    }

}
