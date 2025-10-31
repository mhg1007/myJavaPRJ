package baekjoon;

import java.util.Scanner;

public class B9546 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int k=s.nextInt();
            double x=0;
            for (int j = 0; j < k; j++) {
                x=(x+0.5)*2;
            }
            System.out.println((int)x);
        }
    }
}
