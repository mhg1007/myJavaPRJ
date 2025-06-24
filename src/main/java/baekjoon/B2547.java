package baekjoon;

import java.util.Scanner;

public class B2547 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            long sum=0L;
            for (int j = 0; j < N; j++) {
                sum+=s.nextLong();
                sum%=N;
            }
            System.out.println(sum==0?"YES":"NO");
        }
    }
}
