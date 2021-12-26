package iCode1stStage2021;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c1 = input.next();
        String c2 = input.next();
        if (c1.equals("R") && c2.equals("R")) {
            System.out.println("R");
        } else if (c1.equals("P") && c2.equals("P")) {
            System.out.println("P");
        } else if (c1.equals("S") && c2.equals("S")) {
            System.out.println("S");
        } else if (c1.equals("R") && c2.equals("S")) {
            System.out.println("P");
        } else if (c1.equals("R") && c2.equals("P")) {
            System.out.println("S");
        } else if (c1.equals("P") && c2.equals("S")) {
            System.out.println("R");
        } else if (c1.equals("P") && c2.equals("R")){
            System.out.println("S");
        } else if (c1.equals("S") && c2.equals("P")) {
            System.out.println("R");
        } else {
            System.out.println("P");
        }
    }
}
