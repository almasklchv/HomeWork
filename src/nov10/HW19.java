package nov10;

import java.util.*;

public class HW19 {
    public static void main(String[] args) {
        // Петя перешёл в другую школу. На уроке физкультуры ему понадобилось определить своё место в строю. Помогите ему это сделать.
        // Входные данные:
        // Программа получает на вход невозрастающую последовательность натуральных чисел, означающих рост каждого человека в строю.
        // После этого вводится число X – рост Пети. Все числа во входных данных натуральные и не превышают 200.
        // Выходные данные:
        // Выведите номер, под которым Петя должен встать в строй. Если в строю есть люди с одинаковым ростом, таким же, как у Пети,
        // то он должен встать после них. Нумерация начинается с нуля
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите количество чисел в массиве: ");
        int countOfArray = input.nextInt();
        int[] array = new int[countOfArray];

        System.out.print("Введите массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Введите рост Пети: ");
        int X = input.nextInt();
        int indexX = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == X || (X<array[i-1] && X>array[i])) {
                indexX = i+1 ;
            }
        }

        System.out.println(indexX);
    }
}
