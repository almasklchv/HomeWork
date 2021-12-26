package nov24;

import java.util.*;

// Создайте функцию, которая генерирует одномерный массив интов на n элементов: int[] getRandArr(int n)
// автор кода Алмас Киличов

public class HW7 {

    static int[] getRandArr(int n) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int rand = random.nextInt(24);
            arr[i] = rand;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amountOfElements = input.nextInt();
        int[] arr = getRandArr(amountOfElements);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
