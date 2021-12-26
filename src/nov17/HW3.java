package nov17;

import java.util.*;

public class HW3 {
    public static void main(String[] args) {
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        String URL = input.next();

        for (int i = 0; i < URL.length(); i++) {
            char slash = '/';
            if (URL.charAt(i) != slash) {
                System.out.print(URL.charAt(i));
            } else if ((URL.charAt(i) == slash) && (URL.charAt(i - 1) != slash)) {
                System.out.println();
            }
        }
    }
}