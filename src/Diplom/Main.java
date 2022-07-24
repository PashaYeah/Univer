package Diplom;

import Diplom.model.Group;
import Diplom.model.Methodist;
import Diplom.model.Student;
import Diplom.model.Teacher;
import Diplom.util.Converter;

import java.io.IOException;
import java.util.List;

import static Diplom.util.ParserUtil.addStudents;
import static Diplom.util.ParserUtil.addTeachers;


public class Main {
    public static void main(String[] args) throws IOException {

        List<Teacher> teachers = addTeachers();
        System.out.println("Количество учителей в Array в начале - " + teachers.size());   ///// Печатаю для проверки, что всё работает

        List<Student> students = addStudents();
        System.out.println("Количество студентов в Array - "+ students.size());      ///// Печатаю для проверки, что всё работает

        System.out.println("Заработная плата более 9000 рублей у учителей:");
        teachers.stream().filter(t -> t.getHourlyPayment()*t.getHours() > 9000).forEach(t -> System.out.println(t));
        System.out.print("Уже на пенсии:");
        teachers.stream().filter(p -> (p.getGender().equals("муж") && p.getAge() >= 63) || (p.getGender().equals("жен") && p.getAge() >= 58)).forEach(p -> System.out.println(p));

////////////////////////////Блок расчета заработной платы
        teachers.get(1).payment(teachers.get(1).getHourlyPayment(), teachers.get(1).getHours());
/////////////Блок конвертации преподавателя в Методиста
        Converter<Methodist, Teacher> teacherToMetodist = (teacher) -> new Methodist(teacher.getName(), teacher.getLastname(), teacher.getAge(), teacher.getAddress(), teacher.getGender(), 75, 168);

        Methodist methodist1 = teacherToMetodist.convert(teachers.get(0));
        System.out.println(methodist1);
        System.out.println(methodist1.getClass());   ////проверка что поменялся класс
        teachers.remove(0);     ///// Удаляем первого учителя, т.к. он стал Методистом
        System.out.println("Количество учителей в Array после перехода первого учителя в Методиста - "+ teachers.size());
///////////////////////////////////Посчитаем заработную плату у нового Методиста :)
        methodist1.payment(methodist1.getHourlyPayment(), methodist1.getHours());
////////Создание группы
        Group group1 = new Group("101321", 2,students, methodist1);
        System.out.println(group1);
//////////////Создание учителей в подчинении у Методиста
        System.out.println("В подчинении у методиста " + methodist1.getName() + " " + methodist1.getLastname() + ":" + teachers.toString());

    }


}
