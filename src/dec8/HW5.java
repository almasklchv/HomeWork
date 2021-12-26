package dec8;

// Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.
// автор кода Алмас Киличов

public class HW5 {

    static String outputDigits(int n) {
        if (n != 0) {
            return outputDigits(n / 10) + n % 10 + " ";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(outputDigits(32365));
    }
}
