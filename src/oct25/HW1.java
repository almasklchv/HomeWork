package oct25;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        // Вам необходимо написать программу, которая по заданному с клавиатуры числу N напечатает таблицу умножения
        // на данное число, например, для N=2, программа должна выводить следующую информацию:
        // 2*1=2; 2*2=4; 2*3=6; 2*4=8; 2*5=10; 2*6=12; 2*7=14; 2*8=16; 2*9=18; 2*10=20
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        System.out.print("Введите N: ");
        int N = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d=%d;\n", N, i, N * i);
        }
    }
}
