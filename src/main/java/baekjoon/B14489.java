package baekjoon;

import java.util.Scanner;

public class B14489 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        System.out.print(A+B>=C*2?A+B-C*2:A+B);
    }
}
