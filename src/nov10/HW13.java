package nov10;

import java.util.*;

public class HW13 {
    public static void main(String[] args) {
        // В массиве хранится информация о годе рождения каждого из N человек.
        // Определить наибольший порядковый номер самого младшего по возрасту человека.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int n = 1;
        int N = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        while (n != 0) {
            N = input.nextInt();
            if (N > 0) {
                n = 0;
            }
        }

        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            int rand = 1960 + random.nextInt(62);
            array[i] = rand;
            System.out.print(array[i] + " ");
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] == min && i > minIndex) {
                minIndex = i;
            }

        }

        System.out.println();
        System.out.println(minIndex);
    }
}
