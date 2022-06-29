package Hometask7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scan.nextLine();
        System.out.println("Вы ввели текст - " + text);
        String sb = text;
        scan.close();
        System.out.println("Этот же текст без пробелов - " + sb.replace(" ", ""));
    }
}
