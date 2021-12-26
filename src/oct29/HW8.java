package oct29;

import java.util.Scanner;

public class HW8 {
    public static void main(String args[]) {
        // Вводится число N и затем N чисел по одному в строке. Определить, сколько получено чисел, которые делятся на 3.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int number = 1;
        int sum = 0;

        for (int i = 0; i < amount; i++) {
            number = input.nextInt();
            boolean test = number % 3 == 0;
            if (test) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
