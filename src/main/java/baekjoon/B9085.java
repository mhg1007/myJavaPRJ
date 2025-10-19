package baekjoon;

import java.util.Scanner;

public class B9085 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            int sum=0;
            for (int j = 0; j < N; j++) {
                sum+=s.nextInt();
            }
            System.out.println(sum);
        }
    }
}
