package baekjoon;

import java.util.Scanner;

public class B14623 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long a=s.nextLong(2);
        long b=s.nextLong(2);
        System.out.print(Long.toBinaryString(a*b));
    }
}
