import java.util.*;

public class W8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble(), sum = 0;
        int N = 1;
        boolean isOn = true;

        while (isOn) {
            sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += 1. / i;
            }
            if (A < sum) isOn = false;
            N++;
        }

        System.out.println(sum);
    }
}