package nov10;

import java.util.*;

public class HW9 {
    public static void main(String[] args) {
        // Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного размера из
        // случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого программа должна определить и сообщить пользователю
        // о том, сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь
        // введёт неподходящее число, то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int n = 1;
        int number = 0;
        while (n != 0) {
            number = input.nextInt();
            if (number>0 && number % 2 == 0) {
                n = 0;
            }
        }
        int[] array = new int[number];
        int rightHalf = 0;
        int leftHalf = 0;


        for (int i = 0; i < array.length; i++) {
            int rand = -5 + random.nextInt(11);
            array[i] = rand;
            System.out.print(array[i] + " ");
        }

        int array1 = array.length / 2;

        for (int i = 0; i < array1; i++) {
            leftHalf = leftHalf + array[i];
        }

        for (int i = array1; i < array.length; i++) {
            rightHalf = rightHalf + array[i];
        }

        System.out.println();

        if (rightHalf > leftHalf) {
            System.out.println("Правая половина массива больше.");
        } else if (leftHalf > rightHalf) {
            System.out.println("Левая половина массива больше.");
        } else {
            System.out.println("Обе половины равны.");
        }
    }
}
