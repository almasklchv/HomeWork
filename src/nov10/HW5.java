package nov10;

public class HW5 {
    public static void main(String[] args) {
        // Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый и второй члены последовательности
        // равны единицам, а каждый следующий — сумме двух предыдущих:
        // 1 1 2 3 5 8 13 21 34 55 ...
        // автор кода Алмас Киличов

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == 1) {
                array[i] = 1;
            } else {
                array[i] = array[i-1] + array[i-2];
            }
            System.out.print(array[i] + " ");
        }
    }
}
