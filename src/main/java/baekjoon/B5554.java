package baekjoon;

import java.util.Scanner;

public class B5554 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] t={s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
        int tt=t[0]+t[1]+t[2]+t[3];
        System.out.print(tt/60+"\n"+tt%60);
    }
}
