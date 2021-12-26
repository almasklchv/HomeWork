package dec8;

// Дано натуральное число N. Вычислите сумму его цифр.
// При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
// автор кода Алмас Киличов

public class HW3 {


    static int sumOfNumbers(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfNumbers(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(123));
    }
}
