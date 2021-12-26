package nov10;

import java.util.*;

public class HW12 {
    public static void main(String[] args) {
        // Создайте массив, содержащий рост учеников класса (вводится с клавы). Рост мальчиков условно задан отрицательными числами.
        // Верно ли, что средний рост мальчиков превышает средний рост девочек более чем на 10 см?
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }
        int boys = 0;
        int boysCounter = 0;
        int girls = 0;
        int girlsCounter = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] < 0) {
                boys -= array[i];
                boysCounter++;
            } else if (array[i] > 0) {
                girls += array[i];
                girlsCounter++;
            }
        }
        double boysAverage = 1.0 * Math.abs(boys) / boysCounter;
        double girlsAverage = 1.0 * girls / girlsCounter;
        if (boysAverage - girlsAverage > 10) {
            System.out.println("Средний рост мальчиков (" + boysAverage + ") действительно превышает рост девочек (" + girlsAverage + ") на 10 см или более");
        } else {
            System.out.println("Средний рост мальчиков (" + boysAverage + ") не превышает рост девочек (" + girlsAverage + ") на 10 см");
        }
    }
}
