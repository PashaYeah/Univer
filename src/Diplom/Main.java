package Diplom;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Address addressStudent1 = new Address("Минск", "Притыцкого", 80, 80);
        Address addressStudent2 = new Address("Минск", "Логойский тракт", 12, 17);
        Address addressStudent3 = new Address("Минск", "Жасминовая", 10, 43);

        Address addressTeacher1 = new Address("Минск", "Мачульского", 26, 10);
        Address addressTeacher2 = new Address("Минск", "Калиновского", 5, 17);
        Address addressTeacher3 = new Address("Минск", "Слесарная", 12, 19);
        Address addressTeacher4 = new Address("Минск", "пр-т Независимости", 168, 102);

        Teacher teacher1 = new Teacher("Ольга", "Ермолаева", 39, addressTeacher1);
        Teacher teacher2 = new Teacher("Виолетта", "Пупкина", 42, addressTeacher2);
        Teacher teacher3 = new Teacher("Витольд", "Аккордеонов", 45, addressTeacher3);
        Teacher teacher4 = new Teacher("Ромуальд", "Шниперсон", 37, addressTeacher4);



        Student st1 = new Student("Александр", "Иванов", 20, addressStudent1);
        Student st2 = new Student("Владимир", "Сидоров", 21, addressStudent2);
        Student st3 = new Student("Олег", "Петров", 20, addressStudent3);

        List<Student> students = new ArrayList<Student>() {{
            add(st1);
            add(st2);
            add(st3);
        }};
        teacher1.payment(52, 168);
        teacher1.hourlyPayment = 60;
        teacher1.hours = 175;
        teacher1.payment(teacher1.hourlyPayment, teacher1.hours);
/////////////Блок конвертации препода в Методиста
        Converter<Methodist, Teacher> teacherToMetodist = (teacher) -> new Methodist(teacher.getName(), teacher.getLastname(), teacher.getAge(), teacher.getAddress());

        Methodist methodist1 = teacherToMetodist.convert(teacher1);
        System.out.println(methodist1);
        System.out.println(methodist1.getClass());   ////проверка что поменялся класс
//////////Создание группы
        Group group1 = new Group("101321", 2,students, teacher1);
        System.out.println(group1);
////////////////Создание учителей в подчинении у Методиста
        List<Teacher> teachers = new ArrayList<Teacher>() {{
            add(teacher2);
            add(teacher3);
            add(teacher4);
        }};
        System.out.println("В подчинении у методиста " + methodist1.getName() + " " + methodist1.getLastname() + ":" + "\n" + teachers.toString());

    }


}
