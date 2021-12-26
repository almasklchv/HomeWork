package oct29;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        // Найдите и выведите все двузначные числа, которые равны удвоенному произведению своих цифр.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        for (int i = 10; i <= 99; i++) {
            int iUnits = i % 10;
            int iTens = i / 10;
            int test1 = iTens * iUnits;
            boolean test = test1 * 2 == i;
            if (test) {
                System.out.println(i);
            }
        }
    }
}
