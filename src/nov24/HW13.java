package nov24;

import java.util.*;

// Создайте функцию, принимающую массив интов, которая подсчитает количество элементов массива, больших предыдущего (элемента с предыдущим номером).
// автор кода Алмас Киличов

public class HW13 {

    static int countOfElementMoreThanPrev(int[] arr) {
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                counter++;
            }
        }
        return counter;
    }

    static void output(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static int[] getRandArr(int n) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int rand = random.nextInt(24);
            arr[i] = rand;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = getRandArr(12);
        output(array);
        System.out.println(countOfElementMoreThanPrev(array));
    }
}