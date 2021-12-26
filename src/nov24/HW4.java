package nov24;

import java.util.*;

// Напишите функцию, которая определяет является ли пароль криптостойким. Пароль называется криптостойким, если он включает в себя и строчные
// латинские буквы, и заглавные латинские буквы, и цифры, при этом его длина должна быть не менее 8 символов: boolean isEncrypted(String password)
// автор кода Алмас Киличов

public class HW4 {

    static boolean isEncrypted(String password) {
        boolean numbers = false, upper = false, lower = false;
        for (int i = 0; i < password.length(); i++) {
            if ((password.charAt(i) >= '0' && password.charAt(i) <= '9')) {
                numbers = true;
            } else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                upper = true;
            } else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                lower = true;
            }
        }
        return (numbers && upper && lower) && password.length()     >= 8;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.println(isEncrypted(password));
    }
}
