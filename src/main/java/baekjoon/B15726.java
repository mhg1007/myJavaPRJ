package baekjoon;

import java.util.Scanner;

public class B15726 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        System.out.print((long)A*Math.max(B,C)/Math.min(B,C));
    }
}
