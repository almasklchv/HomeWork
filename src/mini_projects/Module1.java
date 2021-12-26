// автор кода Алмас Киличов
package mini_projects;

import java.util.*;

public class Module1 {

    static void output(double sum) {
        System.out.println("Результат: " + sum);
        System.out.print("+ - * / С Q\nВаше действие: ");
    }

    static void calculate(double sum) {
        Scanner input = new Scanner(System.in);
        while (true) {
            output(sum);
            String operation = input.nextLine();
            String forCalculate = "";
            boolean isCorrect = true;
            int dotCounter = 0;

            for (int i = 0; i < operation.length(); i++) {
                char symbol = operation.charAt(i);
                if (i > 0) {
                    if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/' || symbol == 'C' || symbol == 'Q') {
                        System.out.println("Введите корректно!");
                        isCorrect = false;
                    } else if (operation.charAt(i-1) == '.' && symbol == '.') {
                        if (isCorrect)  System.out.println("Введите корректно!");
                        isCorrect = false;
                    } else if (operation.charAt(i) == '.') {
                        dotCounter++;
                        if (dotCounter > 1) {
                            if (isCorrect)  System.out.println("Введите корректно!");
                            isCorrect = false;
                        }
                    }

                }
            }
            dotCounter = 0;

            if (isCorrect) {
                forCalculate = operation.substring(1);
                if (operation.charAt(0) == '+') {
                    sum += Double.parseDouble(forCalculate);
                } else if (operation.charAt(0) == '-') {
                    sum -= Double.parseDouble(forCalculate);
                } else if (operation.charAt(0) == '*') {
                    sum *= Double.parseDouble(forCalculate);
                } else if (operation.charAt(0) == '/') {
                    sum /= Double.parseDouble(forCalculate);
                } else if (operation.charAt(0) == 'C') {
                    sum = 0;
                } else if (operation.charAt(0) == 'Q') {
                    System.out.println("Программа завершена.");
                    break;
                } else {
                    System.out.println("Неверная операция. Введите корректно!");
                    continue;
                }
            }

        }
    }

    public static void main(String[] args) {
        calculate(0);
    }
}