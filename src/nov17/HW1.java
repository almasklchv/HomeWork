package nov17;

import java.util.*;

public class HW1 {
    public static void main(String[] args) {
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        String lastName = "";
        String name = "";
        String patronymic = "";

        for (int i = 0; i < 3; i++) {
            String fullName = input.next();
            String firstLetter = fullName.substring(0, 1);
            String firstLetterToUpperCase = firstLetter.toUpperCase() + fullName.substring(1);
            if (i == 0) {
                lastName = firstLetterToUpperCase;
            } else if (i == 1) {
                name = firstLetterToUpperCase;
            } else if (i == 2) {
                patronymic = firstLetterToUpperCase;
            }
        }

        System.out.printf("%s %s. %s.", lastName, name, patronymic);
    }
}
