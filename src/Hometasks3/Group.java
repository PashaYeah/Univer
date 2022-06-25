package Hometasks3;

public class Group {
    String groupName = "101321";
    int course = 2;
    Address address;
    Student student = new Student("Василий", "Петров", 18, address);
    Teacher teacher = new Teacher("Василиса Матвеевна", "Иванова", 40, address);

    public void setStudent(Student student){
        this.student = student;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
}
