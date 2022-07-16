package Diplom;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address addressStudent1 = new Address("Минск", "Притыцкого", 80, 80);
        Address addressStudent2 = new Address("Минск", "Логойский тракт", 12, 17);
        Address addressStudent3 = new Address("Минск", "Жасминовая", 10, 43);
        Address addressTeacher1 = new Address("Минск", "Мачульского", 26, 10);
        Teacher teach1 = new Teacher("Ольга", "Ермолаева", 39, addressTeacher1);
        Student st1 = new Student("Александр", "Иванов", 20, addressStudent1);
        Student st2 = new Student("Владимир", "Сидоров", 21, addressStudent2);
        Student st3 = new Student("Олег", "Петров", 20, addressStudent3);
//        Address address1 = new Address("Брест", "Советская", 14, 7);
//        st1.setAddress(address1);
        st1.toString();

        teach1.setAddress(addressTeacher1);
        teach1.toString();
        List<Student> students = new ArrayList<Student>() {{
            add(st1);
            add(st2);
            add(st3);
        }};
//        teach1.payment(52, 168);
//        teach1.hourlyPayment = 60;
//        teach1.hours = 175;
//        teach1.payment(teach1.hourlyPayment, teach1.hours);

        Group group1 = new Group("101321", 2,students, teach1);

        System.out.println(group1);



    }
}
