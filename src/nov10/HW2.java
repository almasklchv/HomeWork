package nov10;

import java.util.*;

public class HW2 {
    public static void main(String[] args) {
        // Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
        // Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
        // автор кода Алмас Киличов

        Random random = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            int rand = 1 + random.nextInt(10);
            array[i] = rand;
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
