package nov10;

import java.util.*;

public class HW3 {
    public static void main(String[] args) {
        // Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках.
        // Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
        // (либо сообщите, что их средние арифметические равны).
        // автор кода Алмас Киличов

        Random random = new Random();
        int[] array1 = new int[5]; int[] array2 = new int[5];
        double averageOfArray1 = 0;
        double averageOfArray2 = 0;

        for (int i = 0; i < array1.length; i++) {
            int rand = random.nextInt(5);
            array1[i] = rand;
            averageOfArray1 += 0.0 + array1[i];
            System.out.print(array1[i] + " ");
        }
        averageOfArray1 = averageOfArray1 / array1.length;

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            int rand = random.nextInt(5);
            array2[i] = rand;
            averageOfArray2 += 0.0 + array2[i];
            System.out.print(array2[i] + " ");
        }
        averageOfArray2 = averageOfArray2 / array2.length;

        System.out.println();

        if (averageOfArray1 > averageOfArray2) {
            System.out.print("Значение average этого массива больше: ");
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + " ");
            }
        } else if (averageOfArray2 > averageOfArray1) {
            System.out.print("Значение average этого массива больше: ");
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
            }
        } else {
            System.out.println("Значения average обоих массивов равны!");
        }
    }
}
