package oct29;

import java.util.*;

public class HW15 {
    public static void main(String[] args) {
        // Вводится число, проверить есть ли повторяющиеся цифры. Если да вывести yes, если нет - no
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b, c;
        for (;a > 9;) {
            b = a / 10;
            c = a % 10;
            a /= 10;
            for (;b != 0;) {
                if (c == b % 10) {
                    System.out.println("yes");
                    return;
                }
                b /= 10;
            }
        }
        System.out.println("no");
    }
}
