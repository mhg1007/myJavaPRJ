package baekjoon;

import java.util.Scanner;

public class B14241 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int num=s.nextInt();
        int sum=0;
        for (int i = 1; i < N; i++) {
            int n=s.nextInt();
            sum+=num*n;
            num+=n;
        }
        System.out.print(sum);
    }
}
