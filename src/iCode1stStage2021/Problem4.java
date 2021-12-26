package iCode1stStage2021;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        StringBuilder pal = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '0') {
                counter++;
            } else if (number.charAt(i) != '0') {
                counter = 0;
            }
        }

        for (int i = 0; i < counter; i++) {
            pal.append("0");
        }
        pal.append(number);

        String palindrome = "";

        for (int i = pal.length()-1; i >= 0; i--) {
            palindrome += pal.charAt(i);
        }



        if (palindrome.equals(pal+"")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}