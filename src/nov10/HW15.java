package nov10;

import java.util.*;

public class HW15 {
    public static void main(String[] args) {
        // Дан массив, состоящий из целых чисел.
        // Напишите программу, которая подсчитает количество элементов массива, больших предыдущего (элемента с предыдущим номером).
        // автор кода Алмас Киличов

        Random random = new Random();
        int[] array = new int[10];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            int rand = random.nextInt(20);
            array[i] = rand;
            if (i != 0) {
                if (array[i] > array[i-1]) {
                    counter++;
                }
            }
            System.out.print(array[i] + " ");
            if (i == array.length-1) {
                System.out.println();
            }
        }

        System.out.println(counter);
    }
}