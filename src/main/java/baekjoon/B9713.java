package baekjoon;

import java.util.Scanner;

public class B9713 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            int sum=0;
            for (int j = 1; j <= N; j+=2) {
                sum+=j;
            }
            System.out.println(sum);
        }
    }
}
