package baekjoon;

import java.util.Scanner;

public class B9295 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println("Case "+(i+1)+": "+(a+b));
        }
    }
}
