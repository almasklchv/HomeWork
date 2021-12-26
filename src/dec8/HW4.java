package dec8;

// Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами или новыми строками.
// автор кода Алмас Киличов

public class HW4 {

    static int outputReverse(int n) {
        if (n != 0) {
            System.out.print(outputReverse(n / 10) + n % 10 + " ");
        }
        return 0;
    }

    public static void main(String[] args) {
        outputReverse(32365);
    }
}