package Diplom;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Student extends People {

    public Student(String name, String lastname, int age, Address address) {
        super(name, lastname, age, address);
    }

    public String toString() {
        return "\n" + "Имя студента - " + super.getName() + ", фамилия - " + super.getLastname() + ", возраст - " + super.getAge()
                + ", проживающий по адресу: " + super.getAddress().toString();
    }

    ///////////////////////////////////////////////////
    public static List<Student> addStudents() throws IOException {


        List<Student> randomStudents = new ArrayList<Student>();
        InputStreamReader fis = null;
        String str = "";

        try {
            fis = new InputStreamReader(new FileInputStream("students.txt"), "UTF-8");

            int a;
            while ((a = fis.read()) != -1) {
                str += (char) a;
            }
        } catch (IOException e) {
            System.out.println("Пипец! Файл со студентами отсутствует!");
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
        String[] massStr = str.split("\r\n");
        for (String st : massStr) {
            String massss[] = st.split(" ");
            Address adressSt = new Address(massss[3], massss[4], Integer.parseInt(massss[5]), Integer.parseInt(massss[6]));
            Student teacherRandom = new Student(massss[0], massss[1], Integer.parseInt(massss[2]), adressSt);
            randomStudents.add(teacherRandom);
        }
        return randomStudents;
    }
}



