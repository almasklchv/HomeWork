package oct29;

import java.util.Scanner;

public class HW12 {
    public static void main(String args[]) {
        // Вводится число N и затем N чисел по одному в строке. Определите, какое количество элементов этой последовательности,
        // равны ее наибольшему элементу
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int number = 1;
        int sum = 0;
        int max = -1;

        for (int i = 0; i < amount; i++) {
            number = input.nextInt();
            if (number > max) {
                max = number;
                sum = 0;
            } else if (number == max) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
