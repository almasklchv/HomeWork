package nov17;

import java.util.*;

public class HW8 {
    public static void main(String[] args) {
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (i >= str.indexOf("h") && i <= str.lastIndexOf("h")) {
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }
}