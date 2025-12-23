package baekjoon;

import java.util.Scanner;

public class B12833 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        for (int i = 0; i < C; i++) {
            A=A^B;
        }
        System.out.print(A);
    }
}
