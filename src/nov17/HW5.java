package nov17;

import java.util.*;

public class HW5 {
    public static void main(String[] args) {
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        String symbolString = input.nextLine();
        int counterOfWords = 0; // счетчик слов
        int amountOfSymbols = 0;

        for (int i = 1; i < symbolString.length(); i++) {
            if ((symbolString.charAt(i) != ' ') && symbolString.charAt(i-1) != ' ') {
                amountOfSymbols++;
            } else if ((symbolString.charAt(i-1) != ' ') && i != symbolString.length()-1){
                amountOfSymbols = 0;
                if (counterOfWords == 0)
                    counterOfWords = 1;
                counterOfWords++;
            }
        }

        System.out.println("В этой строке " + counterOfWords + " слов(а).");
    }
}