package baekjoon;

import java.util.Scanner;

public class B16673 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();
        int[] kp={s.nextInt(),s.nextInt()};
        int sum=0;
        for (int i = 1; i <= c; i++) {
            sum+=kp[0]*i+kp[1]*i*i;
        }
        System.out.print(sum);
    }
}
