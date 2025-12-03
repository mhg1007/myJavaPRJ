package baekjoon;

import java.util.Scanner;

public class B11312 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            long a=s.nextLong(),b=s.nextLong();
            System.out.println(a*a/(b*b));
        }
    }
}
