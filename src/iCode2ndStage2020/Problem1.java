package iCode2ndStage2020;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int l = 0, r = 0, i = 0, x = 0;
        int N = input.nextInt(); // number of plants with strawberries
        int[] amountOfStrawberries = new int[N];
        for (int w = 0; i < amountOfStrawberries.length; w++) {
            amountOfStrawberries[i] = input.nextInt();
        }

        int choose = 0;
        int M = input.nextInt(); // number of requests
        for (int e = 0; e < M; e++) {
            for (int j = 0; j < 3; j++) {
                int n = input.nextInt();
                if (j == 0) {
                    choose = n;
                }
                if (choose == 1) {
                    if (j == 1) {
                        l = input.nextInt();
                    } else if (j == 2) {
                        r = input.nextInt();
                    }
                } else if (choose == 2) {
                    if (j == 1) {
                        i = input.nextInt();
                    } else if (j == 2) {
                        x = input.nextInt();
                    }
                }
            }
            for (int k = l; k <= r; k++) {
                counter += amountOfStrawberries[k];
                amountOfStrawberries[k] -= amountOfStrawberries[k];
            }
            amountOfStrawberries[i] = x;
        }

        System.out.println(counter);

    }
}
