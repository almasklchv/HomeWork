package nov17;

import java.util.*;

public class HW2 {
    public static void main(String[] args) {
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        String password = input.next();
        int n = -1;
        boolean isStrong = false;

        while (n != 0) {
            boolean isOn = true;
            boolean numbers = true;
            boolean upperCase = true;
            boolean lowerCase = true;

            for (int i = 48; i <= 122; i++) {
                char ch = (char) i;
                String test = Character.toString(ch);

                if ((ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96)) {
                    continue;
                }
                if ((ch >= 48 && ch <= 57) && numbers) {
                    if (password.contains(test)) {
                        numbers = false;
                    }
                    continue;
                }
                if ((ch >= 65 && ch <= 90) && upperCase) {
                    if (password.contains(test)) {
                        upperCase = false;
                    }
                    continue;
                }
                if ((ch >= 97 && ch <= 122) && lowerCase) {
                    if (password.contains(test)) {
                        lowerCase = false;
                    }
                }
            }

            if (!numbers && !upperCase && !lowerCase) {
                isStrong = true;
            }

            if (isOn) {
                n = 0;
            }
        }

        if (isStrong && (password.length() >= 8)) {
            System.out.println("этот пароль криптостойкий");
        } else {
            System.out.println("этот пароль не криптостойкий");
        }
    }
}