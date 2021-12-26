package oct25;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        // Вывести ряд чисел с формулой общего члена i в степени i: 1 4 27 256 3125 (т.е. 1^1 2^2 3^3 4^4 5^5).
        // Не использовать встроенные функции для расчета степени
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = input.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum * i;
            }
            System.out.print(sum + " ");
            sum = 1;
        }



    }
}
