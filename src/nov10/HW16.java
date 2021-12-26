package nov10;

import java.util.*;

public class HW16 {
    public static void main(String[] args) {
        // Дан массив, состоящий из целых чисел. Напишите программу, которая определяет, есть ли в массиве пара соседних элементов с
        // одинаковыми знаками.
        // Входные данные:
        // Сначала задано число N — количество элементов в массиве (1<=N<=10000). Далее через пробел записаны N чисел — элементы массива.
        // Массив состоит из целых чисел.
        // Выходные данные:
        // Необходимо вывести слово YES, если существует пара соседних элементов с одинаковыми знаками. В противном случае следует вывести
        // слово NO.
        // Примеры
        // входные данные:
        // 5
        // 1 -3 4 -2 1
        // выходные данные:
        // NO
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        boolean hasPair = false;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 1; i < N; i++) {
            if (array[i - 1] == array[i]) {
                hasPair = true;
                break;
            }
        }
        if (hasPair) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
