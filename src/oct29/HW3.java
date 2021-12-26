package oct29;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        // Даны два четырёхзначных числа A и B. Выведите все четырёхзначные числа на отрезке от A до B, запись которых является палиндромом.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int A = input.nextInt(), B = input.nextInt();
        int n = 1;

        while (n != 0) {
            int remainderNumber;
            int reverseNumber = 0;
            for (int i = A; i > 0;) {
                remainderNumber = i % 10;
                reverseNumber = remainderNumber + reverseNumber * 10;
                i = i / 10;
                if (A == reverseNumber) {
                    System.out.print(A + " ");
                }
            }

            if (A < B) {
                A++;
            } else {
                n = 0;
            }
        }
    }
}
