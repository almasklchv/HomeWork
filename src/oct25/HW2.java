package oct25;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        // Даны два целых числа A и B. Необходимо вывести все нечетные числа на отрезке от А до B
        // Входные данные: На вход программе подаются два целых числа A и B (A≤B), по одному в строке
        // Выходные данные: Вывести через пробел все нечетные числа на заданном отрезке
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите A: ");
        int A = input.nextInt();
        System.out.print("Введите B: ");
        int B = input.nextInt();

        for (; A <= B; A++) {
            boolean test = A % 2 == 0;
            if (!test) {
                System.out.print(A + " ");
            }
        }

    }
}
