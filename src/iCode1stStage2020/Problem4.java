package iCode1stStage2020;

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n, a, ans = 0;
        n = input.nextInt();
        a = input.nextInt();

        for (long i = a; i >= 1; i--) {
            if (n - i >= 0) {
                ans += n - i;
            }
        }

        System.out.println(ans + n);
    }
}
