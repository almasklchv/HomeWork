package dec6;

import java.util.*;

/*
 Напишите функцию, генерирующую массив n*n элементов. Напишите функции, принимающие этот двумерный массив, которые ищут:
 1) сумму всех элементов
 2) минимум и максимум(в целом двумерном массиве)
 3) номер строки, в которой сумма элементов наибольшая
 4) сумму элементов выше главной диагонали
 5) сумму элементов ниже побочной диагонали
*/
// автор кода Алмас Киличов

public class HW {

    public static void main(String[] args) {
        int[][] arr = getRandArr2(5);
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println("1) Сумма всех элементов - " + getSumElements2(arr));
        System.out.println("2) Минимум и максимум - " + getMinElement2(arr) + " " + getMaxElement2(arr));
        System.out.println("3) Номер строки, в которой сумма элементов наибольшая - " + getMaxNumberOfString(arr));
        System.out.println("4) Сумма элементов выше главной диагонали: " + getHigh(arr));
        System.out.println("5) Сумма элементов ниже побочной диагонали: " + getLow(arr));
    }

    static int[][] getRandArr2(int n) { // генерация массива n*n элементов
        Random random = new Random();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int r = 1 + random.nextInt(5);
                arr[i][j] = r;
            }
        }
        return arr;
    }

    static int getSumElements2(int[][] arr) { // 1) сумма всех элементов
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static int getMinElement2(int[][] arr) { // 2.1) минимальный элемент в массиве
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) min = arr[i][j];

            }
        }
        return min;
    }

    static int getMaxElement2(int[][] arr) { // 2.2) максимальный элемент в массиве
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) max = arr[i][j];
            }
        }
        return max;
    }

    static int getMaxNumberOfString(int[][] arr) { // 3) номер строки, в которой сумма элементов наибольшая
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int indexOfString = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                indexOfString = i;
            }
            if (sum > max) {
                max = sum;
                maxIndex = indexOfString;
            }
            sum = 0;
        }
        return maxIndex;
    }

    static int getHigh(int[][] arr) { // 4) Сумма элементов выше главной диагонали
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j > i) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    static int getLow(int[][] arr) { // 5) Сумма элементов ниже побочной диагонали
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j >= arr.length) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}