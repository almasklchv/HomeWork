package oct29;

import java.util.Scanner;

public class HW13 {
    public static void main(String args[]) {
        // Вводится число N и затем N чисел по одному в строке. Необходимо найти расстояние (по модулю) между
        // первым минимальным и первым максимальным числом последовательности.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt(), number = 1, counter = 0, min = 999999999, max = -999999999, iteration = 0, minIteration = 0, maxIteration = 0;


        for (int i = 0; i < amount; i++) {
            iteration++;
            number = input.nextInt();
            if (number > max) {
                max = number;
                maxIteration = iteration;
            }
            if (number < min) {
                min = number;
                minIteration = iteration;
            }
            if (minIteration < maxIteration) {
                counter = maxIteration - minIteration;
            } else if (maxIteration < minIteration) {
                counter = minIteration - maxIteration;
            }
        }


        System.out.println(counter);
    }
}
