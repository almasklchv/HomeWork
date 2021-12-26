package oct25;

import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        // Вывести (для n введенного с клавиатуры):
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
