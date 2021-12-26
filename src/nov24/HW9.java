package nov24;

import java.util.*;

// Создайте функцию, которая принимает массив интов и заменяет каждый элемент с нечётным индексом на ноль. Выведите получившийся массив
// функцией output. void changeNegativeIndexByZero(int[] arr) - функция должна быть воидовская!!!
// автор кода Алмас Киличов

public class HW9 {

    static void output(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void changeNegativeIndexByZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }
        }
        output(arr);
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
        Random random = new Random();
        int[] arr = getRandArr(12);
        output(arr);
        changeNegativeIndexByZero(arr);
    }
}