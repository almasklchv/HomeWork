package nov24;

import java.util.*;

// Создайте функцию, которая принимает строку, в которой буква h встречается минимум два раза. Функция Удаляет из этой строки первое и
// последнее вхождение буквы h, а также все символы, находящиеся между ними: String removeH(String input)
// автор кода Алмас Киличов

public class HW5 {

    static String removeH(String input) {
        int iStart = input.indexOf("h"), iEnd = input.lastIndexOf("h");
        input = input.replace(input.substring(iStart, iEnd+1), "");
        return input;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        System.out.println(removeH(string));
    }
}