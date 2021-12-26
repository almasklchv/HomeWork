package oct25;

import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        // Вывести (для n введенного с клавиатуры):
        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = input.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            for (int z = i; z <= n; z++) {
                System.out.print(" ");
            }
        }


    }
}
