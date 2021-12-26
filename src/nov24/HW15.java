package nov24;

import java.util.*;

// Дан массив, упорядоченный по неубыванию элементов в нем {1, 1, 2, 3, 3, 3, 3, 4, 4}. Напишите функцию, принимающую такой массив,
// и возвращающую кол-во различных элементов в нем: int getDistinctCount(int[] arr).
// автор кода Алмас Киличов

public class HW15 {

    static int getDistinctCount(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (counter == 0) counter = 1;
            if (i != 0) {
                if (arr[i] != arr[i - 1]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 2, 3, 3, 3, 3, 4, 4};
        System.out.println(getDistinctCount(array));
    }
}