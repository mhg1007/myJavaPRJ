package baekjoon;

import java.util.Scanner;

public class B2420 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long N=s.nextLong();
        long M=s.nextLong();
        System.out.print(Math.abs(N-M));
    }
}
