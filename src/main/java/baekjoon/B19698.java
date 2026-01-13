package baekjoon;

import java.util.Scanner;

public class B19698 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int W=s.nextInt();
        int H=s.nextInt();
        int L=s.nextInt();
        int mx=(W/L)*(H/L);
        System.out.print(Math.min(mx, N));
    }
}
