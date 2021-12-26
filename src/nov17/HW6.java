package nov17;

import java.util.*;

public class HW6 {
    public static void main(String[] args) {
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        String symbolString = input.nextLine();
        int counter = 0;
        int maxCount = 0;
        String s = "";
        int index = 0;
        int maxIndex;

        for (int i = 1; i < symbolString.length(); i++) {
            if (symbolString.charAt(i-1) != ' ' && symbolString.charAt(i) != ' ') {
                counter++;
                if (i >= 2) {
                    if (symbolString.charAt(i - 2) == ' ') {
                        index = i-1;
                    }
                }
            } else {
                if (counter > maxCount){
                    maxCount = counter;
                    maxCount++;
                    maxIndex = index;
                    int endMaxIndex = i;
                    s = symbolString.substring(maxIndex, endMaxIndex);
                }
                counter = 0;
            }
        }

        System.out.println(s);
        System.out.println(maxCount);
    }
}