package baekjoon;

import java.util.Scanner;

public class B2355 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        long min=Math.min(A,B);
        long max=Math.max(A,B);
        System.out.print((min+max)*(max-min+1)/2);
    }
}
