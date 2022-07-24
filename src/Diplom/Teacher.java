package Diplom;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
        return "\n" + "Имя учителя - " + super.getName() + ", фамилия - " + super.getLastname() + ", возраст - " + super.getAge()
                + ", проживающий по адресу: " + super.getAddress().toString();
    }


    public void payment(double hourlyPayment,double hours) {

        double pay = hourlyPayment * hours;
        System.out.println("Заработная плата учителя за месяц составляет " + pay + " рублей, за " + hours + " отработанных часов.");
    }
///////////////////////////////////////////////////
public static List<Teacher> addTeachers() throws IOException {


    List<Teacher> randomTeachers = new ArrayList<Teacher>();
    InputStreamReader fis = null;
    String str = "";

    try {
        fis = new InputStreamReader(new FileInputStream("teachers.txt"), "UTF-8");

        int a;
        while ((a = fis.read()) != -1) {
            str += (char) a;
        }
    } catch (IOException e) {
        System.out.println("Пипец! Файл с учителями отсутствует!");
    } finally {
        if (fis != null) {
            fis.close();
        }
    }
    String[] massStr = str.split("\r\n");
    for (String st : massStr) {
        String massss[] = st.split(" ");
        Address adress = new Address(massss[3], massss[4], Integer.parseInt(massss[5]), Integer.parseInt(massss[6]));
        Teacher teacherRandom = new Teacher(massss[0], massss[1], Integer.parseInt(massss[2]), adress, Integer.parseInt(massss[7]), Integer.parseInt(massss[8]));
        randomTeachers.add(teacherRandom);
    }
    return randomTeachers;
}
}