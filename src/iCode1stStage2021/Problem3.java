package iCode1stStage2021;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int counter = 0;

        for (int i = 0; i < N; i++) {
            int n = input.nextInt();
            if (n == 5) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
