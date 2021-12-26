package nov24;

import java.util.*;

// Создайте функцию, которая генерирует массив на n элементов, и заполняет его числами Фибоначчи. Напоминаем, что первый и второй члены
// последовательности равны единицам, а каждый следующий — сумме двух предыдущих: 1 1 2 3 5 8 13 21 34 55 ...
// автор кода Алмас Киличов

public class HW11 {

    static int[] getFibonacci(int n) {
        int[] fibonacci = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }
        return fibonacci;
    }

    static void output(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] fibonacci = getFibonacci(24);
        output(fibonacci);
    }
}