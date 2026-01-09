package baekjoon;

import java.util.Scanner;

public class B17263 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int mx=0;
        for (int i = 0; i < N; i++) {
            mx=Math.max(mx,s.nextInt());
        }
        System.out.print(mx);
    }
}
