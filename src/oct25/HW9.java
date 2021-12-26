package oct25;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        // Вывести (для n введенного с клавиатуры):
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
