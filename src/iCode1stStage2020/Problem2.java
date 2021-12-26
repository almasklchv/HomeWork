package iCode1stStage2020;

import java.util.*;

public class Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int copyNumber = number;
        int palindrome = 0;
        while (number != 0) {
            palindrome = (number % 10) + (palindrome * 10);
            number /= 10;
        }
        if (palindrome == copyNumber) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}