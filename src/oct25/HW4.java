package oct25;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        // Напишите программу, которая находит сумму квадратов целых чисел от a до b (a и b вводятся с клавиатуры)
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = input.nextInt();
        System.out.print("Введите b: ");
        int b = input.nextInt();
        int sum = 0;

        for (; a <= b; a++) {
            int square = a * a;
            sum += square;
        }

        System.out.println(sum);
    }
}
