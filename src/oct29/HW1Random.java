package oct29;

import java.util.*;

public class HW1Random {
    public static void main(String[] args) {
        // Известно что курс тенге к доллару ежегодно падает на 4%-6% (может быть дробное - 4.81%).
        // Спрогнозируйте курс тенге к доллару через N лет. Текущий курс считать 440 тг/$
        // автор кода Алмас Киличов

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println(440-(440./100.*4.));
        int test = rand.nextInt(2+1);
        System.out.println(test);

    }
}
