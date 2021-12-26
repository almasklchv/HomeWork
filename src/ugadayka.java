import java.util.*;

public class ugadayka {
    public static void main(String[] args) {
        System.out.print("Запуск программы...\n");
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int r = random.nextInt(128);
        System.out.println("Случайное число сгенерировано.");
        System.out.println("Случайное число: " + r);
        int n = -1;
        long counter = 1;

        System.out.println("Компьютер пытается угадать число...");
        while (n != r) {
            n = random.nextInt(128);
            if (n != r) {
                counter++;
                System.out.println("Компьютер ввел: " + n);
            } else {
                System.out.printf("Компьютер угадал с %d раза.", counter);
            }
        }
    }
}
