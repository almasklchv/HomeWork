package nov24;

import java.util.*;

// Создайте функцию, которая будет генерировать пароль длиной n символов, чтобы в нем были строчные и заглавные буквы,
// а также цифры: String getRandomPassword(int n)
// автор кода Алмас Киличов

public class HW1 {
    static Random random = new Random();

    static String getRandomPassword(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            char rand = (char) (48 + random.nextInt(75));
            if ((rand >= ':' && rand <= '@') || (rand >= '[' && rand <= '`')) {
                i--;
            } else {
                result += rand;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String password = getRandomPassword(8);
        System.out.println(password);
    }
}