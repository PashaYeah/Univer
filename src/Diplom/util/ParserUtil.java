package Diplom.util;

import Diplom.model.Address;
import Diplom.model.Student;
import Diplom.model.Teacher;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ParserUtil {
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
            Student teacherRandom = new Student(massss[0], massss[1], Integer.parseInt(massss[2]), adressSt, massss[7]);
            randomStudents.add(teacherRandom);
        }
        return randomStudents;
    }

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
            Teacher teacherRandom = new Teacher(massss[0], massss[1], Integer.parseInt(massss[2]), adress, massss[7],Integer.parseInt(massss[8]), Integer.parseInt(massss[9]));
            randomTeachers.add(teacherRandom);
        }
        return randomTeachers;
    }
}
