package oct29;

import java.util.*;

public class HW14 {
    public static void main(String args[]) {
        // Вводится число N и затем N чисел по одному в строке.
        // Определите, какое наибольшее число подряд идущих элементов этой последовательности равных друг другу.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int number = 1;
        int prevNumber = -1;
        int currRepLen = 0;
        int maxRepLen = 0;

        for (int i = 0; i < amount; i++) {
            number = input.nextInt();
            if (prevNumber == number) {
                currRepLen += 1;
            } else {
                prevNumber = number;
                if (maxRepLen > currRepLen) {
                    maxRepLen = maxRepLen;
                } else if (currRepLen > maxRepLen) {
                    maxRepLen = currRepLen;
                }
                currRepLen = 1;
            }
        }

        if (currRepLen > maxRepLen) {
            maxRepLen = currRepLen;
        }


        System.out.println(maxRepLen);
    }
}
