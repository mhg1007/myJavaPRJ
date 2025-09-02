package baekjoon;

import java.util.Scanner;

public class B5347 {
    public static long ecd(long a, long b) {
        return b==0?a:ecd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            long a=s.nextLong();
            long b=s.nextLong();
            System.out.println(a*b/ecd(a,b));
        }
    }
}
