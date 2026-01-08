package baekjoon;

import java.util.Scanner;

public class B16204 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int K=s.nextInt();
        /*
        카드 N개
        M개 앞면 O, N-M개 앞면 X
        K개 뒷면 O, N-K개 뒷면 X
         */
        System.out.print(Math.min(M,K)+Math.min(N-M,N-K));
    }
}
