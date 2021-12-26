package nov10;

import java.util.*;

public class HW7 {
    public static void main(String[] args) {
        // Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
        // Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом
        // к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке), затем
        // вывести количество целых элементов в третьем массиве.
        // автор кода Алмас Киличов

        Random random = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        int counterOfInt = 0;

        for (int i = 0; i < array1.length; i++) {
            int rand = 1 + random.nextInt(9);
            array1[i] = rand;
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            int rand = 1 + random.nextInt(9);
            array2[i] = rand;
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            double array1N = array1[i];
            double array2N = array2[i];
            array3[i] = array1N / array2N;
            System.out.print(array3[i] + " ");
            if (array3[i] % 1 == 0) {
                counterOfInt++;
            }
        }

        System.out.println("\n" + counterOfInt);
    }
}
