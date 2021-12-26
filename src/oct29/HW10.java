package oct29;

import java.util.Scanner;

public class HW10 {
    public static void main(String args[]) {
        // Вводится число N и затем N чисел по одному в строке. Найти максимальное чётное число среди всех введённых чисел.
        // Гарантируется, что в последовательности есть хотя бы одно четное число
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int number = 1;
        int max = -1;

        for (int i = 0; i < amount; i++) {
            number = input.nextInt();
            if ((number > max) && (number % 2 == 0)) {
                max = number;
            }
        }

        System.out.println(max);

    }
}
