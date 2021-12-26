package nov24;

import java.util.*;

// Создайте функцию, которая считает кол-во четных элементов в одномерном массиве: int countEven(int[] arr)
// автор кода Алмас Киличов

public class HW8 {

    static int countEven(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 8, 1, 2, 7, 11, 4, 12, 26, 1};
        System.out.println(countEven(arr));
    }
}
