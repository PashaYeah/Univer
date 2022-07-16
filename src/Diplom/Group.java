package Diplom;

import java.util.List;

public class Group {
    private String groupName;
    private int course;
    private List<Student> students;
    private Teacher teacherGroup;

    public Group(String groupName, int course, List<Student> students, Teacher teacherGroup) {
        this.groupName = groupName;
        this.course = course;
        this.students = students;
        this.teacherGroup = teacherGroup;
    }

    @Override
    public String toString() {
        return "Группа: " + "\n" +
                "Название группы: " + groupName + "\n"
                + "Курс - " + course + "\n"
                + "Студенты: " + students + "\n"
                + "Руководитель группы - " + teacherGroup +
                ".";
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacherGroup() {
        return teacherGroup;
    }

    public void setTeacherGroup(Teacher teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

}
