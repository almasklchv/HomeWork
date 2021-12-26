package oct25;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        // По целому натуральному числу N вычислите N! ("эн-факториал") – произведение всех натуральных чисел от 1 до N
        // (N!=1⋅2⋅3⋅…⋅N ).
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите N: ");
        int N = input.nextInt();
        int factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.printf("%d! = %d", N, factorial);

    }
}

