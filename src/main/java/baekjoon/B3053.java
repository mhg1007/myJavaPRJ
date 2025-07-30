package baekjoon;

import java.util.Scanner;

public class B3053 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int R=s.nextInt();
        double pi=Math.PI;
        System.out.printf("%.6f\n%.6f",pi*R*R,(double)2*R*R);
    }
}
