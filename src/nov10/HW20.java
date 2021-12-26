package nov10;

import java.util.*;

public class HW20 {
    public static void main(String[] args) {
        // Дан список, упорядоченный по неубыванию элементов в нем. Определите, сколько в нем различных элементов.
        // автор кода Алмас Киличов

        int[] array = new int[]{1, 1, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        int counter = 1;

        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                if (array[i] != array[i-1]) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
