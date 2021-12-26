package oct25;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        // Вывести ряд чисел от 0 до N в виде: 0 -1 2 -3 4 -5 6 -7 8 ... N
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите N: ");
        int N = input.nextInt();

        for (int i = 0; i <= N; i++) {
            boolean test = i % 2 == 0;
            if (!test) {
                System.out.print(-i + " ");
            } else if (test) {
                System.out.print(i + " ");
            }

        }
    }
}
