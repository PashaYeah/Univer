package Diplom;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static Diplom.Student.addStudents;
import static Diplom.Teacher.addTeachers;


public class Main {
    public static void main(String[] args) throws IOException {

        List<Teacher> teachers = addTeachers();
        System.out.println("Количество учителей в Array в начале - " + teachers.size());   ///// Печатаю для проверки, что всё работает

        List<Student> students = addStudents();
        System.out.println("Количество студентов в Array - "+ students.size());      ///// Печатаю для проверки, что всё работает

////////////////////////////Блок расчета заработной платы
        teachers.get(1).payment(teachers.get(1).getHourlyPayment(), teachers.get(1).getHours());
/////////////Блок конвертации преподавателя в Методиста
        Converter<Methodist, Teacher> teacherToMetodist = (teacher) -> new Methodist(teacher.getName(), teacher.getLastname(), teacher.getAge(), teacher.getAddress(), 75, 168);

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
