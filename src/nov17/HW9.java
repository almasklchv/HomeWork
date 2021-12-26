package nov17;

import java.util.*;

public class HW9 {
    public static void main(String[] args) {
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        boolean isInvalid = false;
        
        for (int i = 33; i < 127; i++) {
            if ((i >= 48 && i <= 57) || (i >= 64 && i <= 90) || (i >= 97 && i <= 122) || i == 46 || i == 95) {
                continue;
            }
            if (email.contains(Character.toString(i))) {
                isInvalid = true;
                break;
            }
        }

        int dot = email.lastIndexOf(".");
        int dog = email.lastIndexOf("@");
        if (dot != -1 && dog != -1) {
            if (!(email.substring(dot).length() >= 3 && (email.substring(dog).length() >= 2 && email.substring(dog, email.indexOf(".")).length() >= 2))) {
                isInvalid = true;
            }
            if (!(email.substring(dog).contains(".") && email.substring(0, dog).length() >= 1)) {
                isInvalid = true;
            }
        } else {
            isInvalid = true;
        }

        if (isInvalid) {
            System.out.println("невалидно");
        } else {
            System.out.println("валидно");
        }

    }
}