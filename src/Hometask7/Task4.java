package Hometask7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scan.nextLine(); //Почему сразу не получается создать объект стрингБюилдер???
        scan.close();
        StringBuilder sb = new StringBuilder(text).reverse();
        System.out.println("Способ реверс - " + sb);
        //для проверки сделал реверсом

        String[] array = text.split("");
        String[] arrayRevers = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRevers[array.length - i - 1] = array[i];
        }
        for(int j = 0; j < arrayRevers.length; j++) {
            System.out.print(arrayRevers[j]);
        }
    }
}
