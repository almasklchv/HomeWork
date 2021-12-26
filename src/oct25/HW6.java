package oct25;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        // По данному натуральному n≥2 вычислите сумму 1×2+2×3+...+(n-1)×n. Ответ выведите в виде вычисленного
        // выражения и его значения в точности, как показано в примере: ввод - 4, вывод - 1*2+2*3+3*4=20
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = input.nextInt();
        int i = 1, b = 0, c = i + 1;

        for (; c <= n; ) {
            b = b + (i * c);
            System.out.print((i + "*" + c));
            i++;
            c++;
            if (n >= c) {
                System.out.print("+");
            }
        }
        System.out.print("=" + b);
    }
}
