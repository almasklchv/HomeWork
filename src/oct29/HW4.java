package oct29;

import java.util.Scanner;

public class HW4 {
    public static void main(String args[]) {
        // По данному натуральному n<=9 выведите лесенку из n ступенек, i-я ступенька состоит из чисел от 1 до i без пробелов,
        // при вводе 3 программа выведет:
        // 1
        // 12
        // 123
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
