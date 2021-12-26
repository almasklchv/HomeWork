package nov24;

import java.util.*;

// Используя функцию getRandArr(int n) создайте два массива со случайными числами (размерами n и m).
// Напишите функцию, которая выведет те элементы первого массива (в том порядке, в каком они идут в первом массиве),
// которых нет во втором массиве: void printDifference(int[] arr1, int[] arr2)
// автор кода Алмас Киличов

public class HW14 {

    static void printDifference(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
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
        Scanner input = new Scanner(System.in);
        int[] n = getRandArr(input.nextInt());
        int[] m = getRandArr(input.nextInt());
        printDifference(n, m);
    }
}