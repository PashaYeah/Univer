package WorkTask9;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            int a = 8;
            int b = 2;
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println("Произошла ошибка");
            ae.printStackTrace();
        } finally {
            System.out.println("Конец решения");
        }
        System.out.println("End");
    }
}
