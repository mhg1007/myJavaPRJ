package baekjoon;

import java.util.Scanner;

public class B3034 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int W=s.nextInt();
        int H=s.nextInt();
        double L=Math.sqrt(W*W+H*H);
        for (int i = 0; i < N; i++) {
            int n=s.nextInt();
            System.out.println(n<=L?"DA":"NE");
        }
    }
}
