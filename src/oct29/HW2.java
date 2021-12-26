package oct29;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        // Вводится число. Проверить является ли оно палиндромом, то есть одинаково читается с обеих сторон
        // (25652, 78966987, 4521254)
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isNegative = false;

        if (number < 0) {
            number *= -1;
            isNegative = true;
        }

        int remainderNumber;
        int reverseNumber = 0;

        for (int i = number; i > 0;) {
            remainderNumber = i % 10;
            reverseNumber = remainderNumber + reverseNumber * 10;
            i = i / 10;
        }

        if (isNegative) {
            number = -number;
            reverseNumber = -reverseNumber;
        }

        System.out.printf("Ваше число: %d\nВаше число в перевернутом виде: %d\n", number, reverseNumber);
        if (number == reverseNumber) {
            System.out.println("палиндром");
        } else {
            System.out.println("не палиндром");
        }
    }
}
