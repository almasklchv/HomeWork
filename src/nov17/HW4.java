package nov17;

import java.util.*;

public class HW4 {
    public static void main(String[] args) {
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        String str = input.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                System.out.print("b");
            } else if (str.charAt(i) == 'b') {
                System.out.print("a");
            } else if (str.charAt(i) == 'A') {
                System.out.print("B");
            } else if (str.charAt(i) == 'B') {
                System.out.print("A");
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}