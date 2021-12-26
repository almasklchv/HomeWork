package nov10;

import java.util.*;

public class HW18 {
    public static void main(String[] args) {
        // Даны два массива чисел, на N и M элементов.
        // Требуется вывести те элементы первого массива (в том порядке, в каком они идут в первом массиве), которых нет во втором массиве.
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество чисел для первого массива: ");
        boolean isTrue;
        int countOfArray = input.nextInt();
        int[] array = new int[countOfArray];

        System.out.println("Введите массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Введите количество чисел для второго массива: ");
        int countOfArray2 = input.nextInt();
        int[] array2 = new int[countOfArray2];
        System.out.println("Введите массив: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            isTrue = true;
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                System.out.print(array[i] + " ");
            }
        }
    }
}