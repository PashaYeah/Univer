package Hometask8;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            array.add((int) (Math.random() * 100));   //заполнили цифрами от 0 до 100
        }
        for (int j = 0; j < 100000; j++) {
            array.get((int) (Math.random() * 100000));
        }
        System.out.println("Время выполнения операции с ARRAY - " + ((System.currentTimeMillis() - time1)) + " милисекунд");

        ///////////////////////////////////////////////////

        long time2 = System.currentTimeMillis();
        LinkedList<Integer> linked = new LinkedList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            linked.add((int) (Math.random() * 100));   //заполнили цифрами от 0 до 100
        }
        for (int j = 0; j < 100000; j++) {
            linked.get((int) (Math.random() * 100000));
        }
            System.out.println("Время выполнения операции с LINKED - " + ((System.currentTimeMillis() - time2)) + " милисекунд");
    }
}
