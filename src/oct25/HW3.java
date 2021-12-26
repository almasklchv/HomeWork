package oct25;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        // Дано натуральное число n. Напечатайте все n-значные нечетные натуральные числа в порядке убывания.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = input.nextInt();
        double from = Math.pow(10, n);
        double to = Math.pow(10, n - 1);

        if (n == 1) {
            for (int i = 9; i >= 0; i--) {
                boolean test = i % 2 == 0;
                if (!test) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = (int) from - 1; i >= 10; i--) {
                boolean test = i % 2 == 0;
                if (!test) {
                    System.out.println(i);
                }
            }
        }

    }
}
