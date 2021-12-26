package oct29;

import java.util.Scanner;

public class HW11 {
    public static void main(String args[]) {
        // Вводится число N и затем N чисел по одному в строке. Определите, сколько элементов этой последовательности больше предыдущего элемента.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int number = 1;
        int prevN = 0;
        int sum = -1;

        for (int i = 0; i < amount; i++) {
            number = input.nextInt();
            boolean test = number > prevN;
            if (test) {
                sum++;
            }
            prevN = number;
        }

        System.out.println(sum);
    }
}
