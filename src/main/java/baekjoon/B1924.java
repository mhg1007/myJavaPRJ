package baekjoon;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class B1924 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LocalDate date=LocalDate.of(2007,s.nextInt(),s.nextInt());
        DayOfWeek dayOfWeek=date.getDayOfWeek();
        System.out.print(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase());
    }
}
