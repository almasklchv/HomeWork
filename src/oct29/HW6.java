package oct29;

import java.util.Scanner;

public class HW6 {
    public static void main(String args[]) {
        // Дано число N. На вход программы подаются N чисел.
        // Необходимо вывести позицию минимального и максимального чисел среди всех чисел.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int min = 999999999;
        int max = -1;
        int number = 1;

        for (int i = 0; i < amount; i++) {
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}
