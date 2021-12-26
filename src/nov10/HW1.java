package nov10;

import java.util.*;

public class HW1 {
    public static void main(String[] args) {
        // Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
        // Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
        // автор кода Алмас Киличов

        Random random = new Random();
        int[] array = new int[15];
        int sumOfEven = 0;

        for(int i = 0; i < array.length; i++) {
            int rand = random.nextInt(10);
            array[i] = rand;
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                sumOfEven++;
            }
        }

        System.out.println();
        System.out.println(sumOfEven);
    }
}
