package Diplom.model;

import java.util.List;

public class Group {
    private String groupName;
    private int course;
    private List<Student> students;
    private Teacher teacherGroup;
    private Methodist methodistGroup;

    public Group(String groupName, int course, List<Student> students, Methodist methodistGroup) {
        this.groupName = groupName;
        this.course = course;
        this.students = students;
        this.teacherGroup = teacherGroup;
        this.methodistGroup = methodistGroup;
    }

    public Methodist getMethodistGroup() {
        return methodistGroup;
    }

    public void setMethodistGroup(Methodist methodistGroup) {
        this.methodistGroup = methodistGroup;
    }

    @Override
    public String toString() {
        return "Группа: " + "\n" +
                "Название группы: " + groupName + "\n"
                + "Курс - " + course + "\n"
                + "Студенты: " + students + "\n"
                + "Руководитель группы - " + methodistGroup +
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
