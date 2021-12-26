import java.util.*;

public class W8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = 0;

        if (x <= 5) {
            y = Math.pow((x - 5), 2);
        } else {
            y = Math.sqrt(x - 5);
        }

        System.out.println(y);
    }
}