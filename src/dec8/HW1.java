package dec8;

// Дано натуральное число n. Выведите все числа от 1 до n.
// автор кода Алмас Киличов

public class HW1 {

    static int outputFrom1To_n(int n) {
        if (n != 0) System.out.println(n + 1 - outputFrom1To_n(n - 1));
        return 1;
    }

    public static void main(String[] args) {
        outputFrom1To_n(5);
    }
}
