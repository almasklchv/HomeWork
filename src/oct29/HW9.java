package oct29;

import java.util.Scanner;

public class HW9 {
    public static void main(String args[]) {
        // Вводится число N и затем N чисел по одному в строке. Определить, сколько получено двузначных чисел, которые заканчиваются на 3
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int number = 1;
        int sum = 0;

        for (int i = 0; i < amount; i++) {
            number = input.nextInt();
            boolean testA = number >= 10 && number <= 99;
            boolean testB = testA && number % 10 == 3;
            if (testB) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
