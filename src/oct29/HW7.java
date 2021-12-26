package oct29;

import java.util.Scanner;

public class HW7 {
    public static void main(String args[]) {
        // Вводится число N и затем N чисел по одному в строке. Требуется найти сумму элементов этой последовательности.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int number = 1;
        int sum = 0;

        for (int i = 0; i < amount; i++) {
            number = input.nextInt();
            sum = sum + number;
        }

        System.out.println(sum);
    }
}
