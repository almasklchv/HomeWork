package iCode1stStage2020;

import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); // количество студентов
        int M = input.nextInt(); // количество дисциплин
        int c = 0;
        int counter = 0;

        for (int i = 0; i < N; i++) {
            int copyM = M;
            boolean isTwo = false;

            for (int j = 0; j < M; j++) {
                copyM = input.nextInt();
                if (copyM == 2) {
                    c++;
                }
            }

            if (c > 0) {
                c = 0;
            } else if (c == 0) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}