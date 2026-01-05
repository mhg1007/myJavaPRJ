package baekjoon;

import java.util.Scanner;

public class B14652 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int K=s.nextInt();
        System.out.print((K/M)+" "+(K%M));
    }
}
