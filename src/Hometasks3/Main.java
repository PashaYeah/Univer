package Hometasks3;

public class Main {
    public static void main(String[] args) {
        Address addressStudent = new Address("Минск", "Притыцкого", 80, 80);
        Address addressTeacher = new Address("Минск", "Лещинского", 17, 490);
        Student tom = new Student("Саша", "Иванов", 20, addressStudent);
        tom.displayInfo();
        Address address1 = new Address("Брест", "Советская", 14, 7);
        tom.setAddressStudent(address1);

        Teacher olga = new Teacher("Ольга Владимировна", "Ермолаева", 39, addressTeacher);
        Address addressTeacher1 = new Address("Минск", "Мачульского", 26, 10);
        olga.setAddressTeacher(addressTeacher1);
        olga.displayInfo();
        olga.payment(52,168);
        olga.hourlyPayment = 60;
        olga.hours = 175;
        olga.payment(olga.hourlyPayment, olga.hours);
    }
}
