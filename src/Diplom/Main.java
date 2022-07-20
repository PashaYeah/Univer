package Diplom;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Ольга", "Ермолаева", 39, new Address("Минск", "Мачульского", 26, 10), 62, 168);   ///// Станет Методистом
        Teacher teacher2 = new Teacher("Виолетта", "Пупкина", 42, new Address("Минск", "Калиновского", 5, 17), 54, 168);
        Teacher teacher3 = new Teacher("Витольд", "Аккордеонов", 45, new Address("Минск", "Слесарная", 12, 19), 55, 168);
        Teacher teacher4 = new Teacher("Ромуальд", "Шниперсон", 37, new Address("Минск", "пр-т Независимости", 168, 102), 52, 168);



        Student st1 = new Student("Александр", "Иванов", 20, new Address("Минск", "Притыцкого", 80, 80));
        Student st2 = new Student("Владимир", "Сидоров", 21, new Address("Минск", "Логойский тракт", 12, 17));
        Student st3 = new Student("Олег", "Петров", 20, new Address("Минск", "Жасминовая", 10, 43));

        List<Student> students = new ArrayList<Student>() {{
            add(st1);
            add(st2);
            add(st3);
        }};
////////////////////////////Блок расчета заработной платы
        teacher1.payment(teacher1.getHourlyPayment(), teacher1.getHours());
/////////////Блок конвертации преподавателя в Методиста
        Converter<Methodist, Teacher> teacherToMetodist = (teacher) -> new Methodist(teacher.getName(), teacher.getLastname(), teacher.getAge(), teacher.getAddress(), 75, 168);

        Methodist methodist1 = teacherToMetodist.convert(teacher1);
        System.out.println(methodist1);
        System.out.println(methodist1.getClass());   ////проверка что поменялся класс
/////////////////////////////////////Посчитаем заработную плату у нового Методиста :)
        methodist1.payment(methodist1.getHourlyPayment(), methodist1.getHours());
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
