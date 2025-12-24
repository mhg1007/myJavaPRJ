package baekjoon;

import java.util.Scanner;

public class B13225 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int C=s.nextInt();
        for (int i = 0; i < C; i++) {
            int n=s.nextInt();
            int cnt=0;
            for (int j = 1; j <= n; j++) {
                if (n%j==0) {
                    cnt++;
                }
            }
            System.out.println(n+" "+cnt);
        }
    }
}
