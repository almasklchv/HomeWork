package nov10;

import java.util.*;

public class HW6 {
    public static void main(String[] args) {
        // Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве
        // максимальным и сообщите индекс его последнего вхождения в массив
        // автор кода Алмас Киличов

        Random random = new Random();
        int[] array = new int[12];
        int maxElemOfArray = 0;
        int lastIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int rand = -15 + random.nextInt(30);
            array[i] = rand;
            if (i != 0) {
                if (array[i] > array[i - 1] && array[i] > maxElemOfArray) {
                    maxElemOfArray = array[i];
                }
                if (array[i] == maxElemOfArray) {
                    lastIndex = i;
                }
            }
            System.out.print(array[i] + " ");
        }

        System.out.printf("\nЭлемент %d является максимальным элементом и индекс его последнего вхождения в массив - %d", maxElemOfArray, lastIndex);
    }
}
