package nov10;

import java.util.*;

public class HW8 {
    public static void main(String[] args) {
        // Создайте массив из 11 случайных целых чисел из отрезка [-100;100], выведите массив на экран в строку.
        // Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
        // Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
        // автор кода Алмас Киличов

        Random random = new Random();
        int[] array = new int[11];
        int frequentNumber = -1;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            int rand = -100 + random.nextInt(201);
            array[i] = rand;
            System.out.print(array[i] + " ");
            if (i == array.length-1) {
                System.out.println();
            }
        }

        int prevCount = -1;
        int maxCount = -1;
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            if (counter > prevCount && index == -1) {
                frequentNumber = array[i];
                index = i;
                maxCount = counter;
            } else if (counter > prevCount && counter > maxCount) {
                maxCount = counter;
                frequentNumber = array[i];
                index = i;
            }
            prevCount = counter;
        }

        System.out.println("Число " + frequentNumber + " с индексом[" + index + "] встречается чаще всего раз в массиве.");

    }
}