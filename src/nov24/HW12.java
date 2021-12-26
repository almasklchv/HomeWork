package nov24;

import java.util.*;

// Используя функцию getRandArr(int n) создайте два массива со случайными числами. Создайте функцию, которая принимает два массива интов,
// и возвращает массив, каждый i-ый элемент которого является суммой i-ых элементов двух созданных ранее массивов:
// int[] sumArrays(int[] arr1, int[] arr2)
// автор кода Алмас Киличов

public class HW12 {

    static int[] sumArrays(int[] arr1, int[] arr2) {
        boolean arr1More = false;
        int arrayLength;

        if (arr1.length < arr2.length) arr1More = true;
        if (arr1More) arrayLength = arr1.length;
        else arrayLength = arr2.length;

        int[] sumArrays = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            sumArrays[i] = arr1[i] + arr2[i];
        }
        return sumArrays;
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

    static void output(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = getRandArr(8);
        int[] arr2 = getRandArr(8);
        int[] sumArrays = sumArrays(arr1, arr2);
        output(arr1);
        output(arr2);
        output(sumArrays);
    }
}
