package nov17;

import java.util.*;

public class HW7 {
    public static void main(String[] args) {
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        for (int i = 1; i < str.length(); i++) {
            if (i == 1) {
                if (str.charAt(i-1)==' ')
                    continue;
                System.out.print(str.charAt(i-1));
            }
            if (str.charAt(i) != ' ') {
                System.out.print(str.charAt(i));
            } else if (str.charAt(i) == ' ' && str.charAt(i-1) != ' ') {
                System.out.print(str.charAt(i));
            }
        }
    }
}