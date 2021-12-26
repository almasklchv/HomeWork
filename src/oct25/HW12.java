package oct25;

import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("Введите n: ");
        int helper = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int z = helper; z > 0; z--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            helper--;
        }
    }
}
