package baekjoon;

import java.util.Scanner;

public class B10156 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K=s.nextInt();
        int N=s.nextInt();
        int M=s.nextInt();
        System.out.print(Math.max(K*N-M,0));
    }
}
