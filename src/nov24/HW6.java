package nov24;

import java.util.*;

//  Создайте функцию, которая выводит одномерный массив интов: void output(int[] arr)

public class HW6 {

    static void output(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 8, 2, 12, 65, 34, 95, 6};
        output(arr);
    }
}