package nov24;

import java.util.*;

// Создайте функцию, которая принимает массив интов, и возвращает true если массив является строго возрастающей последовательностью,
// и false в обратном случае
// автор кода Алмас Киличов

public class HW10 {

    static boolean isStrictlyIncreasing(int[] arr) {
        boolean isStrictly = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                isStrictly = true;
            } else if (arr[i] < arr[i-1]){
                isStrictly = false;
                break;
            }
        }
        return isStrictly;
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
        int[] arr = getRandArr(8);
        output(arr);
        System.out.println(isStrictlyIncreasing(arr));
    }
}