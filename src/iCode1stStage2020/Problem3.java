package iCode1stStage2020;

import java.util.*;

public class Problem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        StringBuilder reverseNumber = new StringBuilder();
        while (a > 0) {
            reverseNumber.append(a % b);
            a /= b;
        }
        System.out.println(reverseNumber);
    }
}