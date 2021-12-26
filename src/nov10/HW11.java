package nov10;

import java.util.*;

public class HW11 {
    public static void main(String[] args) {
        // Создайте массив из 10 случайных чисел от 0 до 20, найдите: мин, макс, сумму всех элементов, среднее значение всех элементов,
        // кол-во четных и нечетных элементов.
        // автор кода Алмас Киличов

        Random random = new Random();
        int[] array = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int counterOfEven = 0;
        int counterOdOdd = 0;

        for (int i = 0; i < array.length; i++) {
            int rand = random.nextInt(20);
            array[i] = rand;
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            sum = sum + array[i];
            if (array[i] % 2 == 0 && array[i] != 0) {
                counterOfEven++;
            }
            if (array[i] % 2 != 0 && array[i] != 0) {
                counterOdOdd++;
            }
            System.out.print(array[i] + " ");

        }

        System.out.println();
        double average = (0.0+sum) / (0.0+array.length);
        System.out.printf("""
                Минимальное число: %d
                Максимальное число: %d
                Сумма всех элементов: %d
                Среднее значение: %f
                Количество чётных: %d
                Количество нечётных: %d
                """, min, max, sum, average, counterOfEven, counterOdOdd);
    }
}
