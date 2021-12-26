package nov10;

import java.util.*;

public class HW4 {
    public static void main(String[] args) {
        // Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
        // Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью
        // автор кода Алмас Киличов

        Random random = new Random();
        int[] array = new int[4];
        boolean isStrictlyIncreasing = true;

        for (int i = 0; i < array.length; i++) {
            int rand = 10 + random.nextInt(90);
            array[i] = rand;
            System.out.print(array[i] + " ");
            if (i != 0) {
                if (array[i] < array[i-1]) {
                    isStrictlyIncreasing = false;
                }
            }
        }

        System.out.println();

        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не строго возрастающая последовательность.");
        }
    }
}
