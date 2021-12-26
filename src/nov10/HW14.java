package nov10;

import java.util.*;

public class HW14 {
    public static void main(String[] args) {
        // В массиве хранится информация о количестве людей, живущих на каждом из 15 этажей дома
        // (на первом этаже — в нулевом элементе массива, на втором — в первом и т. д.). Определить два этажа, на которых проживает меньше
        // всего людей. (Если минимальное количество жителей одинаково на 2х и более этажах, то вывести наименьшие этажи )
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;
        int[] a = new int[15];
        int[] b = new int[15];
        int k = 0;
        int m = 0;


        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();

        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                k = i;
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (i != k) {
                b[i] = a[i] - min;

            } else if (i == k) {
                b[i] = Integer.MAX_VALUE;
            }

        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            if (b[i] < min1) {
                min1 = b[i];
                m = i;
            }
        }
        System.out.println(min);
        System.out.println(a[m]);
    }
}