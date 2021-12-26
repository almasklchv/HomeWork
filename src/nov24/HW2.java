package nov24;

import java.util.*;

// С клавиатуры вводится две строки со временем (например "15:48" и "12:21"). Напишите функцию, которая принимает две этих строки,
// и возвращает строку с суммой этих всех времен (1д 04:09) : String sumTimes(String time1, String time2)
// автор кода Алмас Киличов

public class HW2 {
    static int getHours(String time) {
        return Integer.parseInt(time.substring(0, 2));
    }

    static int getMinutes(String time) {
        return Integer.parseInt(time.substring(3, 5));
    }

    static String sumTimes(String time1, String time2) {
        int days = 0;
        int hours = getHours(time1) + getHours(time2);
        int minutes = getMinutes(time1) + getMinutes(time2);

        while (hours >= 24) {
            days++;
            hours -= 24;
        }

        while (minutes >= 60) {
            hours++;
            minutes -= 60;
        }

        if (hours < 10 && minutes < 10) return days + "д 0" + hours + ":0" + minutes;
        else if (hours < 10) return days + "д 0" + hours + ":" + minutes;
        else if (minutes < 10) return days + "д " + hours + ":0" + minutes;
        else return days + "д " + hours + ":" + minutes;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String time1 = input.nextLine();
        String time2 = input.nextLine();
        System.out.println(sumTimes(time1, time2));
    }
}