package Diplom.test;

import Diplom.model.Address;
import Diplom.model.Teacher;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class TeacherTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void payment() {
        Teacher teacher1 = new Teacher("Ольга", "Ермолаева", 39, new Address("Минск", "Мачульского", 26, 10), "жен",62, 168);
        Teacher teacher2 = new Teacher("Виолетта", "Пупкина", 42, new Address("Минск", "Калиновского", 5, 17), "жен",54, 168);
        Teacher teacher3 = new Teacher("Витольд", "Аккордеонов", 45, new Address("Минск", "Слесарная", 12, 19), "муж",55, 168);
        Teacher teacher4 = new Teacher("Ромуальд", "Шниперсон", 37, new Address("Минск", "пр-т Независимости", 168, 102), "муж",58, 168);

        List<Teacher>teachers = new ArrayList<>();

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        Assert.assertNotNull(teachers);
    }
}