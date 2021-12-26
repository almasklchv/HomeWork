package nov10;

import java.util.*;

public class HW10 {
    public static void main(String[] args) {
        // Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n. Если пользователь ввёл не
        // подходящее число, то программа должна просить пользователя повторить ввод. Создать массив из n случайных целых чисел из отрезка [0;n]
        // и вывести его на экран. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int n = 0;
        while (n < 4) {
            n = input.nextInt();
        }
        int[] array = new int[n];
        int even = 0;
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(n+1);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println();
        if (even > 0) {
            int[] arrEven = new int[even];
            int tempCounter = 0;
            for (int k = 0; k < n; k++) {
                if (array[k] % 2 == 0) {
                    arrEven[tempCounter] = array[k];
                    tempCounter++;
                }
            }
            for (int i = 0; i < even; i++) {
                System.out.print(arrEven[i] + " ");
            }
        }
    }
}
