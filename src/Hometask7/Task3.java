package Hometask7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст без ошибок и лищних пробелов");
        String text = scan.nextLine();
        String[] array = text.split(" ");
        scan.close();
        System.out.println("В фразе - " + array.length + " слов!");
    }
}
