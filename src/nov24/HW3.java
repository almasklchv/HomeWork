package nov24;

import java.util.*;

// Создайте функцию, которая принимает одну строку, содержащую математическое выражение с любым кол-вом плюсов и минусов
// (например "52+47-36", или "12-5+32+4"). Функция должна вернуть результат этого выражения: int calculate(String input)
// автор кода Алмас Киличов

public class HW3 {

    static long calculate(String mathExpression) {
        long result = 0;
        mathExpression = mathExpression.replaceAll("-"," -");
        mathExpression = mathExpression.replaceAll("\\+"," ");
        Scanner intNumberGrabber = new Scanner(mathExpression);
        while (intNumberGrabber.hasNextInt())
            result = Long.sum(result, intNumberGrabber.nextInt());
        return result;
    }

    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        System.out.println(calculate(string));
    }
}