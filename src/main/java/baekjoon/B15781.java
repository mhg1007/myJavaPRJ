package baekjoon;

import java.util.Scanner;

public class B15781 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int m1=0, m2=0;
        for (int i = 0; i < n; i++) {
            m1=Math.max(m1,s.nextInt());
        }
        for (int i = 0; i < m; i++) {
            m2=Math.max(m2,s.nextInt());
        }
        System.out.print(m1+m2);
    }
}
