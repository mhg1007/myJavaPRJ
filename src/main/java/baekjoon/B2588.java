package baekjoon;

import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        String B = s.next();
        int D=0;

        for (int i = 2; i >= 0; i--) {
            int C = Integer.parseInt(B.substring(i, i + 1));
            System.out.println(A*C);
            D=D+A*C*(int)Math.pow(10,2-i);
        }
        System.out.print(D);
    }
}
