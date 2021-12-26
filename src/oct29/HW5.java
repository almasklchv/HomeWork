package oct29;

import java.util.Scanner;

public class HW5 {
    public static void main(String args[]) {
        // Вводится число N и затем N чисел по одному в строке
        // Необходимо вывести максимальное число среди всех вводимых чисел.
        // Входные данные:
        // в первой строке вводится число N - количество чисел (N<=100)
        // далее по одному в строке идут N чисел (все числа целые, не превышающие по модулю 10 000)
        // Выходные данные:
        // вывести на экран максимальное число из всех N чисел.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int number = 1;
        int max = -1;

        for (int i = 0; i < amount; i++) {
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
        }

        System.out.println(max);
    }
}
